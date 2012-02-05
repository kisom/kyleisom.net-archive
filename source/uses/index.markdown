---
layout: page
title: "uses"
date: 2012-02-04 10:50
comments: true
sharing: true
footer: true
---

I love the format of [usesthis](http://usesthis.com/), so I decided to mimic
it to explain my setup.

## who are you and what do you do?
I am a software security engineer who writes a lot of code outside of work.
I also help admin a [large public shell server](http://www.devio.us) and 
enjoy doing photography as well.

## what hardware are you using?
For a laptop, i use a mid-2011 
[11" macbook air](http://apple.com/macbookair/) with 4G of RAM and a 
64G SSD. This is supplemented by my mid-2009
[13" macbook pro](http://www.apple.com/macbookpro/) (which I upgraded
with 8G of RAM and a 128G SSD drive) and a [Lenovo](http://www.lenovo.com)
[Thinkpad t410](http://lenovo.com/us/en/PDFs/ThinkPad_T410_T510_Datasheet.html)
(also with 8G of RAM and a 64G SSD) that I use as a portable OpenBSD server 
and remote shell. I prefer the 14.1" screen size, which is my only 
complaint about the macs. I'm not one to keep up on what's the latest and 
greatest hardware. What matters to me are having lots of RAM to run 
virtual machines, having a fast enough processor to run a few virtual 
machines while doing whatever else on the host, and having the longest 
possible battery life. The speedup from having an SSD has been more than 
worth the cost, and I don't think I'll be able to go back to having a 
platter-based system again.

I used to have a Blackberry 8700g, but I don't use a phone much right
now. Right now I'm using a [16G iPad 2](http://www.apple.com/ipad/) and a
[iPod touch](http://www.apple.com/ipodtouch 4G) for my portable computer. 
The iPod is my primary camera, and I use a 
[160G iPod classic](http://www.apple.com/ipodclassic/) for my main media 
device (and a quick emergency backup drive). If I watch videos, it's on the
iPad. I use [Google Voice](https://voice.google.com) and 
[Skype](http://www.skype.com) for calls, although I don't particularly 
care for either.

## and what software?
I use OS X for my primary interaction OS. I spent a while using
[OpenBSD](http://www.openbsd.org) with 
[scrotwm](https://opensource.conformal.com/wiki/scrotwm) (and before
scrotwm, I used [awesome](http://awesome.naquadah.org/) for about 2 years;
before awesome, I used [fluxbox](http://www.fluxbox.org/) for about seven or
eight years). I've been using OS X as my primary OS for about a year
or so. It's not perfect, and I definitely have my reservations about the 
way that Apple tends to cultivate a walled garden, but there are enough 
tools to continue using open source software that I don't have too much of 
a problem.

Software I use every day: [vim](http://www.vim.org/) (mostly 
[macvim](http://code.google.com/p/macvim/)),
[emacs](http://www.gnu.org/software/emacs) (i.e.
[aquamacs](http://aquamacs.org/)),
[git](http://git-scm.com/), [mercurial](http://mercurial.selenic.com/),
[firefox](http://www.mozilla.org/en-US/firefox/new/), 
[Google chrome](http://www.google.com/chrome/),
[cmus](http://cmus.sourceforge.net/) for music,
[vlc](http://www.videolan.org/) for watching videos,
[tmux](http://tmux.sourceforge.net/) and [zsh](http://www.zsh.org/) via
[iterm2](http://www.iterm2.com/), [irssi](http://www.irssi.org/) via a
tmux session on a VPS. My virtual machines in 
[VMWare Fusion](http://www.vmware.com/products/fusion/) for VMs that I to 
use a GUI on and [VirtualBox](https://www.virtualbox.org/) for VMs I want 
to use headlessly. I manage my VMs through the use of 
[fabric](http://fabfile.org/), a python management library. I use 
[SLIME](http://common-lisp.net/project/slime/) and 
[paredit](http://www.emacswiki.org/emacs/ParEdit) for Lisp in Emacs.

I use both [apache httpd](http://httpd.apache.org/) (because I've been 
using it for so long, I know it very well) and 
[nginx](http://www.nginx.org/) which has become a much faster and easier 
to configure web server.

For photo work, I use [aperture](http://www.apple.com/aperture/).

Having [good music](http://www.last.fm/user/brokenlcd) is absolutely 
critical for getting into a good coding state. I live off my
[Beyerdynamic](http://www.beyerdynamic.com/)
[DT-770 PRO](http://north-america.beyerdynamic.com/shop/hah/headphones-and-headsets/studio-and-stage/studio-headphones/dt-770-pro.html)
headphones; I have the 250-ohm headphones that work better with my
[Fiio E7](http://www.fiio.com.cn/product/index.aspx?ID=28&MenuID=020301)
USB DAC and headphone amplifier.

Most days I write in C and [python](http://www.python.org/), though I
write in a variety of languages including Objective-C, emacs lisp and 
javascript. These days, most of my personal code is in 
[Clojure](http://www.clojure.org), a JVM-based Lisp that I've fallen in 
love with since I finally got around to trying it in January of 2012. When 
I'm hacking C or Python, I keep MacVim open with as many tabs as I need on 
one half of the screen and a terminal or two on the other half (widescreen 
for the win). When I'm doing any Lisp, I run Aquamacs full screen with two 
panes, one for editing source code and one for SLIME.

My Apple machines are backed up to a portable drive via Time Machine,
and I have a backup drive with my VPSes and non-Apple machines rsynced. If 
it's important, it's in source control. (When I said I use git every day, 
I really meant every 30 seconds. Only serious.) I make heavy use of 
Github's medium plan (i.e. [my profile](https://github.com/kisom)) and
[my Bitbucket account](https://bitbucket.org/kisom), although I still
have a free Bitbucket account because I don't need more than 5 users.

I keep a small network of [Sheeva plugs](http://www.plugcomputer.org/) 
running Debian that I use for small tasks. They don't draw too much power 
and are quite handy to have on hand. Anything that needs to run continually,
aka any daemons I've got running, run on this network.

## what would be your dream setup?
Ideally, I would have an iphone-sized computer, with shells to plug it into
to give it a table, laptop, or desktop formfactor. Until this is realised, 
I'd love a 13" MacBook Air, and a desktop with two 24" monitors on either 
side and a vertical 24" monitor in the middle for editing code on.
