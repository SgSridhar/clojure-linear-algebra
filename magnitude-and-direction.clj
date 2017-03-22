;; Magnitude of a vector (Distance between the two scalars) and Normalizing a vector (magnitude in the same direction)

(defn magnitude-of-a-vector [v]
    (Math/sqrt (reduce (fn [acc val] (+ acc (* val val))) 0 v)))
    
(defn normalize-vector [v]
    (map (fn [val] (* val (/ 1 (magnitude-of-a-vector v)))) v))

(println (magnitude-of-a-vector [-0.221 7.437]))
(println (magnitude-of-a-vector [8.813 -1.331 -6.247]))

(println (normalize-vector [5.581 -2.136]))
(println (normalize-vector [1.996 3.108 -4.554]))
