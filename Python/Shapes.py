#Samara Canjura 
#shapes.py 
#Finding the area and perimeter of a square, and finding the circumference and area of a circle. 

import math   # Python Library needed for access to math.pi and math.pow

def main():
   inNum = getInput("Input some number: ")
   while inNum != 0:                        #Loop ends when zero input
      if inNum > 0:
         calculate_square(inNum)
      else:
         calculate_circle(inNum)
      inNum = getInput("Input next number: ")
   print("End of Program")

def calculate_square(side):
   perimeter = side * 4
   print("Square with side", side, "has a perimeter", perimeter)
   print("Square with side", side, "has a area", perimeter)
   
def calculate_circle(radius):
   radius = math.fabs(radius)
   pi = math.pi
   r = radius 
   c = 2*pi*r
   a = pi*r*r
   print("Circle w/ radius", radius, "has a circumference", c)
   print("Circle w/ radius", radius, "has a area", c)
   
def getInput(prompt):
   number = float(input(prompt))
   return number
   
main()
