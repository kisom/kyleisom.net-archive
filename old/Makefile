MDPARSER := smu

all: 
	$(MDPARSER) index.md > body.html
	cat hdr.tpl body.html ftr.tpl > index.html

clean:
	rm -f index.html body.html
