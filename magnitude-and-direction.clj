;; Magnitude of a vector (Distance between the two scalars) and Normalizing a vector (magnitude in the same direction)

(defn magnitude-of-a-vector [v]
    (Math/sqrt (reduce (fn [acc val] (+ acc (* val val))) 0 v)))
    
(defn normalize-vector [v]
    (map (fn [val] (* val (/ 1 (magnitude-of-a-vector v)))) v))

(println (magnitude-of-a-vector [-0.221 7.437]))
(println (magnitude-of-a-vector [8.813 -1.331 -6.247]))

(println (normalize-vector [5.581 -2.136]))
(println (normalize-vector [1.996 3.108 -4.554]))

;; dot-product between two vectors

(defn dot-product [v1 v2]
    (reduce (fn [acc v] (+ acc v)) 0 (map * v1 v2)))

(def res1 (dot-product [7.887 4.138] [-8.802 6.776]))
(def res2 (dot-product [-5.955 -4.904 -1.874] [-4.496 -8.755 7.103]))

(println res1)
(println res2)

;; Angle between two vectors
(defn angle [v1 v2]
    (Math/acos (/ (dot-product v1 v2) (* (magnitude-of-a-vector v1) (magnitude-of-a-vector v2)))))
    
(def res3 (angle [3.183 -7.627] [-2.668 5.319]))
(println res3)

(def res4-in-degrees (/ (* (angle [7.35 0.221 5.188] [2.751 8.259 3.985]) 180) Math/PI))
(println res4-in-degrees)
