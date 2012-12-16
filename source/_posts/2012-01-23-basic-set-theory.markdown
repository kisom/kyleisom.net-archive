---
layout: post
title: Basic Set Theory
date: 2012-01-23 17:44
comments: true
categories: math coding python clojure introduction
---
Recently, I was explaining to someone the basics of set theory and how the 
various basic operations translate to the real world. I used the example of the
project I'm currently working on, which is a web front end to my ebook library.
This is a very quick introduction aimed at people with a programming background
but who don't have a strong math background; the goal is to help you to learn
to use them without having to delve deep into the math behind them. 

<!-- more -->

## Basic Properties of Sets

The first thing we have to do is to explain what is meant by a *set* -
> definition: set<br>
> A set is any collection of items where each item is unique and the order of
> items in the collection is not important.

The uniqueness property is very important to sets: there are no duplicates in
a set.

So what does a set look like? In my database, I have a list of all the books 
I have electronic copies of. Each book comes in at least one of three formats:
PDF, epub, or mobi. We'll call the *superset* (the universal set of all the items
under consideration) the list of all the books in the library. We'll call this
set 'L' (for Library). Part of the set might look like:

{% codeblock %}
L = { 'Natural Language Processing with Python', 'Learning OpenCV', 
      'Code Complete', 'Mastering Algorithms with C', 
      'The Joy of Clojure', 'Mining the Social Web', 
      'Algorithms In A Nutshell', 'Introduction to Information Retrieval', 
      ... }
{% endcodeblock %}

We use `'{}'` to denote the members of a set. The order of books in the library
doesn't matter here, and it doesn't make sense to have more than one entry for
a book in the library. 

Building a set in Python is very easy:
{% codeblock lang:python %}
library = set(['Natural Language Processing with Python', 'Learning OpenCV', 
               'Code Complete', 'Mastering Algorithms with C', 
               'The Joy of Clojure', 'Mining the Social Web', 
               'Algorithms In A Nutshell', 
               'Introduction to Information Retrieval', 
               'Network Security With OpenSSL', 'RADIUS'])
{% endcodeblock%}

Clojure has set notation built in using the `#{ }` syntax, and any collection
can be turned into a set with `(set coll)`:
{% codeblock lang:clojure %}
(def library #{ "Natural Language Processing with Python",
                "Learning OpenCV",
                "Code Complete", 
                "Mastering Algorithms with C", 
                "The Joy of Clojure", 
                "Mining the Social Web", 
                "Algorithms In A Nutshell",
                "Introduction to Information Retrieval",
                "Network Security With OpenSSL",
                "RADIUS"})
{% endcodeblock %}

So now we need to build some subsets. 
> definition: subset<br>
> A subset is some part of a set. 

> definition: proper subset<br>
> A proper subset is some part of a set, but is not the whole set.

For example, we'll create a subset of books P that are on or in Python. We'll also create a subset of books E that are in the English language. For my library,
because not all of my books are in or about Python, the number of members of P
is smaller than the number of elements in L. However, all of my books are in
English, so the number of elements in E is the same as the number of elements in
L. Therefore P is a proper subset, while E is not.

## The Basic Set Operations

Now let's consider two proper subsets of the library to explain some of the basic
set operations: M is the subset of ebooks that I have in mobi format, and we'll
redefine E to be the list of ebooks in epub format. For the sake of the rest of
this article, let's note the following:

{% codeblock %}
M = { 'Natural Language Processing with Python', 'Code Complete',
      'Introduction to Information Retrieval' }
E = { 'The Joy of Clojure', 'Mining the Social Web', 'Code Complete' }
{% endcodeblock %}

In practical terms, this means in my library I have copies of:

* "Natural Language Processing with Python," "Introduction to Information 
Retrieval," and "Code Complete" in mobi format
* "The Joy of Clojure," "Mining the Social Web," and "Code Complete" in epub
format.

In Python:
{% codeblock lang:python %}
mobi = set(['Natural Language Processing with Python', 'Code Complete',
           'Introduction to Information Retrieval'])
epub = set(['The Joy of Clojure', 'Mining the Social Web', 'Code Complete'])
{% endcodeblock %}

In Clojure:
{% codeblock lang:clojure %}
(def mobi #{"Natural Language Processing with Python", "Code Complete",
           "Introduction to Information Retrieval"})
(def epub #{"The Joy of Clojure", "Mining the Social Web", "Code Complete"})
{% endcodeblock %}

### Union
A union is the set of members that appear in either set - if it's in at least
one of the sets, it will appear in a union of the two sets. So we could define 
a subset of L that contains all the books I have in a mobile format, which for
our purposes means copies exist in epub or mobi format. In Python, you can
use the `set.union` method, and in Clojure you can use the functions in the
`clojure.set` namespace.

In Python:
{% codeblock lang:python %}
mobile = set.union(mobi, epub)
for book in mobile:
    print book
{% endcodeblock %}

which yields the output:
{% codeblock %}
Natural Language Processing in Python
Code Complete
Introduction to Information Retrieval
The Joy of Clojure
Mining the Social Web
{% endcodeblock %}

Remember that one of the properties of sets is that order is irrelevant, so you
might get the books in a different order (this applies to Clojure as well).

The same thing, in Clojure:
{% codeblock lang:clojure %}
(def mobile (clojure.set/union mobi epub))
(doseq [book mobile] (println (str book)))
{% endcodeblock %}

You would see a similar output to the Python example.

Again, the practical result of this is a set of all the books I have in my
library in a mobile format. 

### Intersection
The intersection of two sets is a list of all the members that only appear in 
both sets. In the library example, taking the intersection of the mobi and epub
sets gives me a set of my books that I have in both epub and mobi format. The 
`intersection` function gives me this result.

The Python example:
{% codeblock lang:python %}
both_formats = set.intersection(mobi, epub)
for book in both_formats:
    print book
{% endcodeblock %}

And in Clojure:
{% codeblock lang:clojure %}
(def both-formats (clojure.set/intersection mobi epub))
(doseq [book both-formats] (println (str book)))
{% endcodeblock %}

For either example, the output should be just one book, given the sample sets:
{% codeblock %}
Code Complete
{% endcodeblock %}

I could use this result to know which books I can use on any mobile device.

### Difference
The difference of one set from another is a list of all the members in the first
set that are not in the second set. This operation is a bit different from the 
first two; the first two operations are 
[commutative](http://en.wikipedia.org/wiki/Commutative_property),
but the result of a difference is dependent on the order of the sets. I'll
illustrate this with some code examples:

In Python:
{% codeblock lang:python %}
only_mobi = set.difference(mobi, epub)
print 'books only in mobi format:'
for book in only_mobi:
    print '\t' + book

only_epub = set.difference(epub, mobi)
print 'books only in epub format:'
for book in only_epub:
    print '\t' + book
{% endcodeblock %}

In Clojure:
{% codeblock lang:clojure %}
(println "books only in mobi format:")
(def only-mobi (clojure.set/difference mobi epub))
(doseq [book only-mobi]
    (println "\t" book))

(println "books only in epub format:")
(def only-epub (clojure.set/difference epub mobi))
(doseq [book only-epub]
    (println "\t" book))
{% endcodeblock %}

As the output messages show, this gives us the set of books that are only
in mobi and the set of books that are only in epub. The output should look
something like:

{% codeblock %}
books only in mobi format:
	Introduction to Information Retrieval
	Natural Language Processing with Python
books only in epub format:
	The Joy of Clojure
	Mining the Social Web
{% endcodeblock %}

### Complements
When discussing complements, we do so when considering a subset and it's 
superset. The complement of a subset is the difference of subset from the
superset; i.e., the set of all members in the superset that are not in the 
subset. For example, if I wanted to check my library for all ebooks I have
that are not in mobi format, I would use the superset `library` and take the 
difference of mobi from library:

In Python:
{% codeblock lang:python %}
not_mobi = set.difference(library, mobi)
print 'books not in mobi format, using the library superset:'
for book in not_mobi:
    print '\t' + book
{% endcodeblock %}

and in Clojure:
{% codeblock lang:clojure %}
(println 'books not in mobi format, using the library superset:')
(def not-mobi (clojure.set/difference library mobi))
(doseq [book not-mobi]
    (println "\t" book))
{% endcodeblock %}

This gives us the output:
{% codeblock %}
books not in mobi format, using the library superset:
	 Mining the Social Web
	 Algorithms In A Nutshell
	 Mastering Algorithms with C
	 RADIUS
	 The Joy of Clojure
	 Network Security With OpenSSL
	 Learning OpenCV
{% endcodeblock %}

## Conclusion
This has been a very basic look at set theory and what it means in practise.
There is a lot more to set theory (see the references) but this should help
get you started. There are a lot of applications for set theory, such as in
data mining and natural language processing; it is a powerful tool that is
worth spending some time to get to know.

Stay tuned for the next post, which will be on how to use sets in your code.
We'll develop the library idea a bit more.

*UPDATE*: The [next post](http://kyleisom.net/blog/2012/02/01/using-set-theory/) is up!

## References
* I've been reading [Alfred Aho's](https://en.wikipedia.org/wiki/Alfred_Aho) [<underline>The Theory of Parsing, Translating, and Compiling (Volume I: Parsing)</underline>](https://en.wikipedia.org/wiki/Special:BookSources/0139145567) 
([Amazon link](http://www.amazon.com/dp/0139145567/))
* There is, of course, a good [wikipedia article](https://en.wikipedia.org/wiki/Set_(mathematics).

## Reviewers
I'd like to thank the following people for reviewing this:

* [Wally Jones](https://www.twitter.com/imwally)
* [Stephen Olsen](https://saolsen.github.com/)
* [Aaron Bieber](https://www.twitter.com/qb1t)
* [Jason Barbier](https://twitter.com/#!/Slaughterhut)
* [Shawn Meier](http://shawnmeier.com/)
* Matt Sowers

## Code Samples
The complete python source code, which you can save to a file and run directly:

{% include_code set_theory/set_theory.py %}

You'll want to run this with `python set_theory.py` (or whatever you choose to
name the file, obviously).

The complete Clojure source code, which you can likewise save and run:

{% include_code set_theory/set-theory.clj %}

You'll want to run this with `clj set-theory.py` - I've deliberately chosen
not to make this a lein project in order to make it easier to share, but I did
[upload a lein project](/downloads/set_theory.tar.gz).
You should be able to just run `lein deps, test, run`.

