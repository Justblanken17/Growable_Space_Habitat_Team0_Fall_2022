import os

# This script is to test and validate that commands can be pushed to the terminal in the python script.

first_command = "cd /home/pi/Desktop/Project"
second_command = "source env/bin/activate"
os.system(first_command)
os.system(second_command)