Kyle Isom
=========
<div class="image">
<img src="github_photo.jpg" />
</div><br />    

<div class="image">
<p><a href="https://github.com/kisom" target="_BLANK">My GitHub Profile</a></p>
</div>

I am a software engineer in the United States, and I deal mostly with
ocean-faring snakes (C and python). This is a quick tour of my
computer interests and GitHub repositories. I am very interested in 
information security, data mining, and natural language processing (although
just getting started with the latter two). Unless explicitly stated otherwise,
all of my code is released under a dual ISC / public domain license, and it's
up to the user which to follow.

Some of the projects that I have actually finished are:
-------------------------------------------------------
- - -

* [ctrans](https://www.github.com/kisom/ctrans): the code comment translator.
This takes C-style and perl-style comments in source code and translates them.
It is based on the Google translate API, which is apparently deprecated. This
taught me some valuable lessons: first, **never** trust a single vendor to have
a locked in API (funny that this should have to be remembered given the history
of tech) and second, it's always wise to pull from multiple sources. Either
way, I ended up pulling this off pretty quickly, so it is a bit rough but it
works (as long as Google Translate works...) 

* [libdaemon](https://github.com/kisom/libdaemon): libdaemon is a lightweight 
daemon framework for OpenBSD. It provides facili- ties for logging and a signal 
handler to enable graceful shutdown, as well as file locking to ensure that 
only a single copy of a given daemon is running at a time. Currently, libdaemon 
is not threaded. Ports to other POSIX-based operating systems may occur in the 
future, depending on whether I need a daemon framework on that platform.

* [irssi scripts](https://github.com/kisom/irssi-scripts): scripts for irssi. 
This includes a couple of scripts that I find useful: *xosd*, an XOSD-based
notification script and *geojoin*, a GeoIP lookup script for IRC joins.

* [timecard](https://github.com/kisom/timecard): a simple timecard / clocking 
program. It features project-based time tracking and a conky mode.

* [rouletted](https://github.com/kisom/py-rouletted): randomly kill users! This
is a python-based script that runs on a server and randomly kills logged in 
users. This is an integral part of a modern BOFH's toolkit and will instill
respect in your users.

* [rawk](https://github.com/kisom/rawk): rage against web frameworks - posix 
shell static site generator. I use this a lot for a couple of my sites:
[my personal site](http://www.kyleisom.net), 
[my coder's site](http://coder.kyleisom.net), 
[my devio.us page](http://kisom.devio.us), and last but not least,
[the rawk documentation site](http://rawk.brokenlcd.net).

* [APOD](https://github.com/kisom/APOD_py): python script to pull down the APOD 
and, in OS X, GNOME, and fluxbox, set the desktop background. I've had this
running on one of my desktops since November 2010 without a glitch.    


Some documentation I've written:
--------------------------------
- - -
I like to write documentation so I don't have to repeat the learning process 
in the future.

* [Intro to Cryptography With PyCrypto ](https://github.com/kisom/crypto_intro): 
It is aimed at introducing basic cryptography topics to programmers who are 
unfamiliar with cryptography and the PyCrypto library. I ended up writing this
after the combination of having to use the library heavily for work (and 
thereby gaining a high level of proficiency with the library) and having some
friends who wanted to do some cryptography work without understanding the
basics of cryptography and what it provides.

* [Introduction to Using OpenSSL in C](https://github.com/kisom/openssl_guide): 
a very much **unfinished** project to write documentation I could use as a 
quick reference when writing SSL code in C. The project that I was working on
requiring C SSL code was nixed, and I ended up not getting anywhere with the
documentation.


Some projects I'm working on that I think are interesting:
----------------------------------------------------------
- - -

* [newsread](https://github.com/kisom/newsread): too many sources in my news 
feeds have far too much noise and it makes getting useful information take up
more of my time than it should. That's the motivation for this project. Along
the way, I expect to learn some natural language processing, datamining, and
fun math to help filter everything out. 

* [pymods](https://github.com/kisom/pymods): a collection of python modules I 
wrote. These include a mail module, a supervisor module (for fault-tolerance),
some NLP code, and a timer module. 
* [woofs](https://github.com/kisom/woofs): woofs allows you to quickly offer a 
file for download on your machine. It behaves the same as the `woof` script 
written by Simon Budig but providing SSL encryption. 

* [Login-Fuzzer](https://github.com/kisom/Login-Fuzzer): fuzzing authentication 
code in python. The story is, I locked myself out of my guru plug while setting 
it up in a hurry. I know what password I intended to use when setting the root 
password, but apparently I typo'd it *twice*. This is my attempt at regaining 
access without having to spend $50 for a JTAG adapter.     

Contact information:
--------------------
- - -

I have a [development GnuPG key](keys/coder.asc):
   pub   4096R/B7B720D6 2010-10-30 [expires: 2015-10-29]
     Key fingerprint = 9C2B BF53 FB89 50D4 554F  1708 35C8 B8B3 B7B7 20D6

I also have [a PGP key](keys/kyle.asc) with current contact information:
   pub   4096R/63AD01BF 2011-06-18 [expires: 2014-01-02]
      Key fingerprint = BDAD 4068 EF75 0A49 49CC  82A0 8705 DF24 63AD 01BF

Both keys are available from the [MIT PGP Public Key Server](http://pgp.mit.edu).

(I've omitted the uid display to prevent my email addresseses from being
harvested for spam). 

End notes:
----------
- - -

The colour scheme is the [Solarized](http://ethanschoonover.com/solarized) 
theme by Ethan Schoover. I also use this theme in 
[all](https://code.google.com/p/macvim/) 
[my](http://aquamacs.org/) 
[text](http://www.barebones.com/products/textwrangler/index.shtml) 
[editors](http://www.activestate.com/komodo-edit), 
as well
as in [iTerm2](http://www.iterm2.com/).

Markdown parsing is provided by [smu](http://s01.de/~tox/index.cgi/proj_smu),
which I find superior to every other markdown parser I've seen.

