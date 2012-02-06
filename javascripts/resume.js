function makeRequest(url) {
    var httpreq = null;
    console.log('makeRequest');
    if (window.httpreqRequest) {
        httpreq = new httpreqRequest();
        if (typeof httpreq.overrideMimeType != 'undefined') { 
            httpreq.overrideMimeType('text/xml'); 
        }
    } else if (window.ActiveXObject) {
        httpreq = new ActiveXObject("Microsoft.httpreq");
    } else {
      render_resume(null, doneLoading = true);
    }

    console.log('making request')
    httpreq.open('GET', url, true);
    httpreq.send(null);
    
    httpreq.onreadystatechange = function() {
        if (httpreq.readyState == 4 && httpreq.status == 200) {
            render_resume(httpreq.responseText, doneLoading = true);
        } else {
            console.log('error retrieving resume.json!')
            render_resume(null, doneLoading = false);
        }
    };
}

function render_resume(jsonData, doneLoading) {
    var data {
        'json': jsonData,
        'doneLoading': doneLoading
    };
    var html = new EJS({url: 'resume.ejs'}).render(data);
}
