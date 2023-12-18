(ns src.clojure-noob.fornoobs)

(if true
  "zeus"
  "aquaman")

(if ""
 (do (println "succces")
     "zeus")
  (do (println "fail")
      "aqueman"))

(nil? 1)

(nil? nil)
(nil? false)


(if "bears"
  "no bears"
  "or bears")
 
(= 1 2)


(def failed-protagonist-names
  ["larry" "doreen" "hulk"])

failed-protagonist-names

(def severity :mild)
(def error-message "OH GOD ITS A DISASTER WE'RE")
(if (= severity :mild)
  (def error-message (str error-message "MILDLY INCONVEINED"))
  (def error-message (str error-message "DOOOOOMED")))

error-message

(defn error-message-func
  [severity]
  (str "OH GOD! ITS A DISASTER! WE'RE"
       (if (= severity :mild)
       "MILDY INCONVENIENCED!"
       "DOOOOOMED!")))

(error-message-func :mil) 

93
1.2
1/5

"lord voldemort"
"\"He who must not be named\""
"\"Great cow of moscow!\" - Herman Conrad"

{:first-name "Charle"
 :last-name "McFishwich"}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :last "Jingleherimerschmidt"}}

(hash-map :a 1 :b 2)

(get {:a 0 :b 1} :b)

(get (get {:a 0 :b {:c "no hum"}} :b) :c)

(get {:a 0 :b 1} :c "no dice")

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])

({:name "Human CoffeePot"} :name)

:a

# Equivalent
(:a {:a 1 :b 2 :c 3})
(get {:a 1 :b 2 :c 3} :a)

(:d {:a 1 :b 2 :c 3} "oh no")

[3 2 1]

(get [3 2 1] 0)

(get ["a" {:name "Pugsley Winterbottom"} "C"] 1)

(defn moonVec
(vector "creepy" "full" "moon"))

(conj [1 2 3] 4)

# Lists
'(1 2 3 4)

(nth '(:a :b :c) 2)
(nth '(:a :b :c) 0)

(list 1 "two" {2 3})

(conj '(1 2 3) 4)

#{"kurt vonnegut" 20 :icicle}

(hash-set 1 1 2 2)

(conj #{:A :B} :B)
(set [3 3 3 3 4 4])

(contains? #{:a :b} :a)
(contains? #{:a :b} 3)
(contains? #{nil} nil)

(:a #{:a :b})

(get #{:a :b} :a)
(get #{:a :B} nil)
(get #{:a :b} "kurt")

