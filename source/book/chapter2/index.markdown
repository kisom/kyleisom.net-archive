---
layout: page
title: "Practical Introduction to Cryptography"
date: 2012-03-01 22:14
comments: true
sharing: true
footer: true
---

<!-- rewrite of chapter 2, started on the flight from Amsterdam back to
     Africa. 

     Notes:
	* what it does
	* what it doesn't do
	* keys
	  * something you know, have, are
	  * symmetric / asymmetric / hybrid
	  * containers / formats
	* padding
	* hashes

-->

Cryptography is a value tool for data security, but like any other tool, it must
be applied properly. In this chapter, we'll take a very brief look at
cryptography's role in security and introduce a few key ideas that will be needed
later. Over this chapter, I'm going to be introducing new terms and for the sake
of the flow of the paragraph, they may not be defined right away. If you come
across an unfamiliar term, stick it in the back of your head as I will likely
explain it later.

We discussed security objectives in chapter 1; cryptography can help us with
privacy, integrity, and repudiation (or non-repudiation). It can provide
privacy by obscuring the contents of the message (in theory, to everyone but
the holders of some secret key). Integrity is provided through digital 
signatures, which are an more secure form of hashing. Finally, there are some
cryptographic protocols that provide non-depudiation, especially public key
cryptography with digital signatures. Others provide such features as
perfect forward secrecy, a technique for providing plausible deniability in
conversations. We'll get back to the topic of repudiability in the next chapter,
"Trust and Usability," but for now just know that the cryptosystem you choose
may provide one of these.

<!-- good god this is a trainwreck -->
The term **key** has come up several times, and now I would like to define
for you. A key is a string of binary data that is fed as an input into the
cryptographic algorithm that provides the information needed in conjunction
with the algorithm to 