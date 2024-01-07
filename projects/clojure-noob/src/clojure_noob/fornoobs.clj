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
(get #{:a :b} nil)
(get #{:a :b} "kurt")

(+ 1 2 3 4)
(* 1 2 3 4)
(first [1 2 3 4])

(or + -)

## All of the below return 6
((or + -) 1 2 3)
((and (= 1 1) +) 1 2 3)
((first [+ =]) 1 2 3)

(1 2 3 4)
("test" 1 2 3)

(inc 1.1)
(map inc [1 2 3 4])

## Order of Operations
(+ (inc 199) (/ 100 (- 7 2)))
(+ 200 (/ 100 (- 7 2)))
(+ 200 (/ 100 5))
(+ 200 20)

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "OH WOW " name " YOU ARE THE BEST MAN SLASH WOMAN EVER I LOVE YOUUU"))

(too-enthusiastic "Zelda")

(doc map)

(defn no-params
  []
  "I take no parameters!")

(no-params)

(defn one-param
  [x]
  (str "I take one parameter: " x))

(one-param "my parameter!")

(defn two-params
  [x y]
  (str "Two parameters! That's nothing!" "I will"
       "Smoosh them together to spite you! " x y))

(two-params "heres one," " here's another")

## Arity overloading

(defn x-chop
  "Describe the kind of chop"
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(x-chop "Kanye west" "slap")
(x-chop "kanye east")

(defn weird-arity
  ([]
   "Destiny dressed you this morning, mny friend.")
  ([number]
  (inc number)))

(weird-arity)
(weird-arity 1)
(weird-arity "1")

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!\n"))

(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The Incredbile Hulk")

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case you need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))

(chooser ["Marmalade", "Handsome JAck", "Pigpen", "Aquaman"])

(defn announce-treasure-location
  [{latitude :lat lng :lng}]
  (println (str "Treasure lat: " latitude))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 28.22 :lng 81.33})

(defn receive-treasure-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))
  1)

(def treasure-location
  {:lat 100.1 :lng 69.420})

(receive-treasure-location treasure-location)

(defn illustrative-function
  []
  (println(+ 1 304))
  30
  "joe")

(illustrative-function)

(defn number-comment
     [x]
     (if (> x 6)
       "Oh my god! what a big number!"
       "That numbers ok, I guess"))

(number-comment 5)
(number-comment 7)
(number-comment 6)

(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3)) 8)

(def my-special-multiplier (fn [x] (* x 3)))

(my-special-multiplier 12)

#(* % 3)

(#(* % 3) 8)

(map #(str "Hi, " %)
     ["Darth Vader" "Mr. Magoo"])

;; function call
(* 8 3)

;; Anonymous funtion
#(* % 3)

(#(str %1 " and " %2) "cornbread" "butter beans")

(#(identity %&) 1 "blarg" :yip)

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7)