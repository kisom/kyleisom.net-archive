;; set-theory.clj
;; author: kyle isom <coder@kyleisom.net>
;; date: 2012-01-23
;; license: ISC / public domain (brokenlcd.net/license.txt)
;;
;; code examples for blog post "Basic Set Theory"
;;     http://kisom.github.com/blog/2012/01/23/basic-set-theory/
;;

(require 'clojure.set)

; the superset
(def library #{ "Natural Language Processing with Python",
                "Learning OpenCV",
                "Code Complete", 
                "Mastering Algorithms with C", 
                "The Joy of Clojure", 
                "Mining the Social Web", 
                "Algorithms In A Nutshell",
                "Introduction to Information Retrieval" 
                "Network Security With OpenSSL", 
                "RADIUS" })

; the subsets
(def mobi #{"Natural Language Processing with Python", "Code Complete",
           "Introduction to Information Retrieval"})
(def epub #{"The Joy of Clojure", "Mining the Social Web", "Code Complete"})

; union illustration
(println "union illustration (books in either mobile format)")
(def mobile (clojure.set/union mobi epub))
(doseq [book mobile] 
    (println "\t" book))

; intersection illustration
(println "intersection illustration (books in both mobile formats)")
(def both_formats (clojure.set/intersection mobi epub))
(doseq [book both_formats] 
    (println "\t" book))


(println "books only in mobi format:")
(def only_mobi (clojure.set/difference mobi epub))
(doseq [book only_mobi]
    (println "\t" book))

(println "books only in epub format:")
(def only_epub (clojure.set/difference epub mobi))
(doseq [book only_epub]
    (println "\t" book))

; complement illustration
(println "books not in mobi format, using the library superset:")
(def not_mobi (clojure.set/difference library mobi))
(doseq [book not_mobi]
    (println "\t" book))

