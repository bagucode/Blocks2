(ns blocks2.main
  (:import [easy_lwjgl EasyLWJGL]
           [org.lwjgl.opengl Display DisplayMode])
  (:gen-class))

(defn -main [& args]
  (Display/setDisplayMode (DisplayMode. 800 600))
  (Display/create)
  (Thread/sleep 10000)
  (Display/destroy))



