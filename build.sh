#!/bin/sh

MDPARSER=$(which smu)

$MDPARSER body.md > body.html

cat hdr.tpl body.html ftr.tpl > index.html
sed -i -e 's|\&gt;|>|g' index.html
sed -i -e 's|\&lt;|<|g' index.html



