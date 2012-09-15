---
layout: post
title: "A System of Useful Output"
date: 2012-08-16 06:30
comments: true
categories: [development]
keywords: [development]
---

In a SILC channel I frequent, I was showing [Steve Olsen](http://saolsen.tumblr.com)
some output from a daemon I have running. His question to me was, 

> "whats with the [+] in your logs?"

A fair question, as every line of the output I sent him had that before it.
So, I'd like to present my system for displaying output. Maybe you'll find it
useful.

<!-- more -->

In my code, I tend to preface every line with one of a few triglyphs:

{% codeblock %}
[+]
[!]
[-]
[*]
{% endcodeblock %}

For example, running my [HSTS check](https://gist.github.com/3277707) utility:

{% codeblock lang:bash %}
<ono-sendai: ~/code/does_hsts> $ ./does_hsts conformal.com google.com news.ycombinator.com lobste.rs
[+] checking whether conformal.com supports HSTS: ok
[+] checking whether google.com supports HSTS: not supported
[+] checking whether news.ycombinator.com supports HSTS: not supported
[+] checking whether lobste.rs supports HSTS: ok
{% endcodeblock %}

In theory, all output should start with `[+]` - this is the symbol I use for
nominal output messages, i.e. typical LOG_NOTICE output. It is just an 
informational message letting me know what my code is doing. Sometimes, during
the debug process, the `[-]` triglyph is used:

{% codeblock %}
[+] connecting to service...
[-] socket id: 4
[+] connected!
{% endcodeblock %}

These are just debug messages that don't need to be in the production code
but are useful during development. They are particularly important because
I tend to debug using output messages as much as I can, without having to
resort to using gdb/pdb/... (although I still use both heavily, particularly
when the debug messages aren't quite giving me what I need or I want to step
through code).

For itemised lists, I use the `[*]` triglyph:

{% codeblock %}
[+] validating foo:
    [*] foo.name
    [*] foo.status
    [*] foo.payload
[+] validated foo
{% endcodeblock %}

Lastly, I denote errors with `[!]`:

{% codeblock %}
[+] connecting to database
[!] connection failed: host unreachable
[!] failed to connect to database!
{% endcodeblock %}

In summary:

{% codeblock %}
[+] LOG_INFO message
[-] LOG_DEBUG message
[*] item in certain multi-line LOG_INFO messages
[!] LOG_WARNING and higher messages
{% endcodeblock %}

This system lets me glance at a log file or terminal output and by scanning
the left-hand column, immediately get a sense for what the code is doing. 
I used to just output similar to:

{% codeblock %}
this is a LOG_INFO message
*** OH NO a warning has occured (error code 61: EDOOFUS) ***
DEBUG: pointer foo is NULL
{% endcodeblock %}

However, I've found my current system is more succinct and just as greppable.

I'd be interested to hear what other people use for similar effects, if they're
using anything at all.
