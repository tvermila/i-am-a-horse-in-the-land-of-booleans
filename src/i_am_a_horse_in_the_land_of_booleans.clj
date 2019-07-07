(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))


(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 5) 0) "buzz"
    (= (mod n 3) 0) "fizz"    
    :else ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))


(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(generic-doublificate {:a 1})

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (divides? 400 year)
      true)
    false))

; '_______'
