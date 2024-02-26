import qualified Geometry.Sphere as Sphere  
import qualified Geometry.Cuboid as Cuboid  
import qualified Geometry.Cube as Cube

main = do
  putStr "\nDigite o tamanho do lado: "
  ld <- getLine
  putStrLn $ "Área do cubo: " ++ show (Cube.area (read ld))
