#============================================================#
#3010 DECEM SECAT (Ten Cuts of 3010)
#A decision based mystery game created by Group 2 from INF224
#Members:
#Cura, Tristan - Coding, Story
#Honrubia, Derek - Story, Description
#Isidoro, Ashley - Story, Description
#============================================================#
import cmd
import textwrap
import sys
import os
import time
screen_width = 100

#### PLAYER SETUP ####
class player:
	def __init__(self):
		self.name = ''
myPlayer = player()

#### TITLE SCREEN ####
def title_screen_selections():
	option = input("> ")
	if option.lower() == ('play'):
		start_game() # Starts the game 
	elif option.lower() == ('quit'):
		sys.exit() # Terminates the game
	while option.lower() not in ['play', 'quit']:
		print("Please enter a valid command...")
		option = input("> ")
		if option.lower() == ('play'):
			start_game() # Starts the game  
		elif option.lower() == ('quit'):
			sys.exit() # Terminates the game

def title_screen():
	os.system('cls')

	print('############################')
	print('#          3010            #')
	print('#       DECEM SECAT        #')
	print('############################')
	print('\t- Play -')
	print('\t- Quit -')
	print('    Created by GROUP 2')
	print(' Cura, Honrubia, Isidoro')
	print('############################')
	title_screen_selections()

#### TRY AGAIN SCREEN ####
def play_again():
	option = input("Play again?... [yes | no] \n> ")
	if option.lower() == ('yes'):
		playagain1 = "\nLoading Menu...."
		for character in playagain1:
			sys.stdout.write(character)
			sys.stdout.flush()
			time.sleep(0.05)
		title_screen()
	elif option.lower() == ('no'):
		playagain1 = "\nExiting Game....\n...\n..\n!"
		for character in playagain1:
			sys.stdout.write(character)
			sys.stdout.flush()
			time.sleep(0.05)
		sys.exit()
	while option.lower() not in ['yes', 'no']:
		print("Please enter a valid command...")
		option = input("Play again?... [yes | no] \n> ")
		if option.lower() == ('yes'):
			playagain1 = "\nLoading Menu...."
			for character in playagain1:
				sys.stdout.write(character)
				sys.stdout.flush()
				time.sleep(0.05)
			title_screen()
		elif option.lower() == ('no'):
			playagain1 = "\nExiting Game....\n...\n..\n!"
			for character in playagain1:
				sys.stdout.write(character)
				sys.stdout.flush()
				time.sleep(0.05)
			sys.exit()

#### Talk Speed ####
def slow_speed(text): #Person Talking
	for character in text:
		sys.stdout.write(character)
		sys.stdout.flush()
		time.sleep(0.05)
def average_speed(text): #Game Talking
	for character in text:
		sys.stdout.write(character)
		sys.stdout.flush()
		time.sleep(0.04)
def fast_speed(text): #Choices // Long
	for character in text:
		sys.stdout.write(character)
		sys.stdout.flush()
		time.sleep(0.03)

#### GAME FUNCTIONS ####
def start_game():
	os.system('cls')

	intro()

def intro():
	#### GAME INTRO, HANDLING USER NAME ####

	#### Begin of Story , introduction ####
	s1 = "\n#Part1#\n*\'knock-knock\'.. A sound can be heard from the door in front of you... \n"
	s1a = "<???> Excuse me, are you there, Detective ______?..."
	s1b = " (What is your name?..)\n"
	average_speed(s1)
	slow_speed(s1a)
	fast_speed(s1b)
	player_name = input("> ") #Saves the input string
	myPlayer.name = player_name #Saves the data to the local variable

	s2 = ("\n<" + myPlayer.name.upper() + "> I am, come in...\n")
	slow_speed(s2)
	s2a = ("<OFFICER> My name is Officer Praefectus, and I was told to bring you this case.\n It's about the kidnapping from 2 months ago, we found a couple of evidences leading to it.\n Please take a \'look\'.\n")
	average_speed(s2a)
	s2b = ("*What would you like to do?\n")
	average_speed(s2b)

	d1 = input("> ")
	if d1.lower() == ('look'):
		s3 = "*You examined the folder and its contents inside it, it IS about the case of the kidnapping but you noticed\n something else. You opened a drawer and looked for another case from 2 months ago.\n It was the killing of 3010, you noticed that some of the evidences linked\n with the current one from the kidnapping.\n"
		fast_speed(s3)

		s3a = "*Do you want to learn more and \'investigate\'?...\n"
		average_speed(s3a)
		d2 = input("> ")
		if d2.lower() == ('investigate'):
			s3b = "*You decided to learn more about this case.\n"
			average_speed(s3b)
			main_game_loop()
		elif d2.lower() == ('no'):
			s3c = "*You declined.\n"
			average_speed(s3c)
			s3d = ("\n<" + myPlayer.name.upper() + "> I'm sorry, but as you can see, I'm still recovering from a head injury \n from a car accident 2 months ago.\n<OFFICER> Oh, I'm sorry to hear that detective. Please take care. I will take my leave now.\n")
			s3e = "\n*The officer left.\n*The sound of the door shut went quite loudly. Although it is 10:30 PM,\n your office felt pretty quiet.\n*Game over..\n<NO ENDING>you did not play the game... how.. sad.\n"
			average_speed(s3d)
			average_speed(s3e)
			play_again()
		while d2.lower() not in ['investigate', 'no']:
			print("Please enter a valid command...")
			d2 = input("> ")
			if d2.lower() == ('investigate'):
				s3b = "*You decided to learn more about this case.\n"
				average_speed(s3b)
				main_game_loop()
			elif d2.lower() == ('no'):
				s3c = "*You declined.\n"
				average_speed(s3c)
				s3d = ("\n<" + myPlayer.name.upper() + "> I'm sorry, but as you can see, I'm still recovering from a head injury \n from a car accident 2 months ago.\n<OFFICER> Oh, I'm sorry to hear that detective. Please take care. I will take my leave now.\n")
				s3e = "\n*The officer left.\n*The sound of the door shut went quite loudly. Although it is 10:30 PM,\n your office felt pretty quiet.\n*Game over..\n<NO ENDING>you did not play the game... how.. sad.\n"
				average_speed(s3d)
				average_speed(s3e)
				play_again()

	while d1.lower() not in ['look']:
		print("Please enter a valid command...")
		d1 = input("> ")
		if d1.lower() == ('look'):
			s3 = "*You examined the folder and its contents inside it, it IS about the case of the kidnapping but you noticed\n something else. You opened a drawer and looked for another case from 2 months ago.\n It was the killing of 3010, you noticed that some of the evidences linked\n with the current one from the kidnapping.\n"
			fast_speed(s3)

			s3a = "*Do you want to learn more and \'investigate\'?...\n"
			average_speed(s3a)
			d2 = input("> ")
			if d2.lower() == ('investigate'):
				s3b = "*You decided to learn more about this case.\n"
				average_speed(s3b)
				main_game_loop()
			elif d2.lower() == ('no'):
				s3c = "*You declined.\n"
				average_speed(s3c)
				s3d = ("\n<" + myPlayer.name.upper() + "> I'm sorry, but as you can see, I'm still recovering from a head injury \n from a car accident 2 months ago.\n<OFFICER> Oh, I'm sorry to hear that detective. Please take care. I will take my leave now.\n")
				s3e = "\n*The officer left.\n*The sound of the door shut went quite loudly. Although it is 10:30 PM, your office felt pretty quiet.\n*Game over..\n*<NO ENDING>you did not play the game... how.. sad.\n"
				average_speed(s3d)
				average_speed(s3e)
				play_again()
			while d2.lower() not in ['investigate', 'no']:
				print("Please enter a valid command...")
				d2 = input("> ")
				if d2.lower() == ('investigate'):
					s3b = "*You decided to learn more about this case.\n"
					average_speed(s3b)
					main_game_loop()
				elif d2.lower() == ('no'):
					s3c = "*You declined.\n"
					average_speed(s3c)
					s3d = ("\n<" + myPlayer.name.upper() + "> I'm sorry, but as you can see, I'm still recovering from a head injury \n from a car accident 2 months ago.\n<OFFICER> Oh, I'm sorry to hear that detective. Please take care. I will take my leave now.\n")
					s3e = "*\n*The officer left.\n*The sound of the door shut went quite loudly. Although it is 10:30 PM, your office felt pretty quiet.\n*Game over..\n<NO ENDING> you did not play the game... how.. sad.\n"
					average_speed(s3d)
					average_speed(s3e)
					play_again()

#### MAIN GAME FUNCTION ####

def main_game_loop():
	os.system('cls')
	choose_path()


def choose_path():
	_s4()
	d3 = input("> ")
	if d3.lower() == ('investigate'):
		_s4a()
		_s4b()
		_s4c()
		_s4d()
		_s4e()
		d4 = input("> ")
		if d4.lower() == ('warehouse'):
			_s4f()
			good_path()
		elif d4.lower() == ('office'):
			_s4g()
			bad_path()
		while d4.lower() not in ['warehouse', 'office']:
			print("Please enter a valid command...")
			d4 = input("> ")
			if d4.lower() == ('warehouse'):
				_s4f()
				good_path()
			elif d4.lower() == ('office'):
				_s4g()
				bad_path()

	while d3.lower() not in ['investigate']:
		print("Please enter a valid command...")
		d3 = input("> ")
		if d3.lower() == ('investigate'):
			_s4a()
			_s4b()
			_s4c()
			_s4d()
			_s4e()
			d4 = input("> ")
			if d4.lower() == ('warehouse'):
				_s4f()
				good_path()
			elif d4.lower() == ('office'):
				_s4g()
				bad_path()
			while d4.lower() not in ['warehouse', 'office']:
				print("Please enter a valid command...")
				d4 = input("> ")
				if d4.lower() == ('warehouse'):
					_s4f()
					good_path()
				elif d4.lower() == ('office'):
					_s4g()
					bad_path()

def good_path():
	os.system('cls')
	_s6()
	d5 = input("> ")
	if d5.lower() == ('front'):
		_s6a()
		_s6b()
		d6 = input("> ")
		if d6.lower() == ('ask'):
			_s6c()
			d7 = input("> ")
			if d7.lower() == ('backdoor'):
				backroom_good()
			while d7.lower() not in ['backdoor']:
				print("Please enter a valid command...")
				d7 = input("> ")
				if d7.lower() == ('backdoor'):
					backroom_good()
		while d6.lower() not in ['ask']:
			print("Please enter a valid command...")
			d6 = input("> ")
			if d6.lower() == ('ask'):
				_s6c()
				d7 = input("> ")
				if d7.lower() == ('backdoor'):
					backroom_good()
				while d7.lower() not in ['backdoor']:
					print("Please enter a valid command...")
					d7 = input("> ")
					if d7.lower() == ('backdoor'):
						backroom_good()

	elif d5.lower() == ('back'):
		backroom_good()

	while d5.lower() not in ['front', 'back']:
		d5 = input("> ")
		if d5.lower() == ('front'):
			_s6a()
			_s6b()
			d6 = input("> ")
			if d6.lower() == ('ask'):
				_s6c()
				d7 = input("> ")
				if d7.lower() == ('backdoor'):
					backroom_good()
				while d7.lower() not in ['backdoor']:
					print("Please enter a valid command...")
					d7 = input("> ")
					if d7.lower() == ('backdoor'):
						backroom_good()
			while d6.lower() not in ['ask']:
				print("Please enter a valid command...")
				d6 = input("> ")
				if d6.lower() == ('ask'):
					_s6c()
					d7 = input("> ")
					if d7.lower() == ('backdoor'):
						backroom_good()
					while d7.lower() not in ['backdoor']:
						print("Please enter a valid command...")
						d7 = input("> ")
						if d7.lower() == ('backdoor'):
							backroom_good()

		elif d5.lower() == ('back'):
			backroom_good()

def bad_path():
	os.system('cls')
	_s5()
	_s5a()
	d5 = input("> ")
	if d5.lower() == ('take'):
		_s5b()
		d6 = input("> ")
		if d6.lower() == ('warehouse'):
			_s5c()
			input("")
			_s6()
			d7 = input("> ")
			if d7.lower() == ('front'):
				_s6a()
				_s6b()
				d8 = input("> ")
				if d8.lower() == ('ask'):
					_s6c()
					d9 = input("> ")
					if d9.lower() == ('backdoor'):
						backroom_bad()
					while d9.lower() not in ['backdoor']:
						print("Please enter a valid command...")
						d9 = input("> ")
						if d9.lower() == ('backdoor'):
							backroom_bad()
				while d8.lower() not in ['ask']:
					print("Please enter a valid command...")
					d8 = input("> ")
					if d8.lower() == ('ask'):
						_s6c()
						d9 = input("> ")
						if d9.lower() == ('backdoor'):
							backroom_bad()
						while d9.lower() not in ['backdoor']:
							print("Please enter a valid command...")
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()

			elif d7.lower() == ('back'):
				backroom_bad()

			while d7.lower() not in ['front', 'back']:
				d7 = input("> ")
				if d7.lower() == ('front'):
					_s6a()
					_s6b()
					d8 = input("> ")
					if d8.lower() == ('ask'):
						_s6c()
						d9 = input("> ")
						if d9.lower() == ('backdoor'):
							backroom_bad()
						while d9.lower() not in ['backdoor']:
							print("Please enter a valid command...")
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
					while d8.lower() not in ['ask']:
						print("Please enter a valid command...")
						d8 = input("> ")
						if d8.lower() == ('ask'):
							_s6c()
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
							while d9.lower() not in ['backdoor']:
								print("Please enter a valid command...")
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()

				elif d7.lower() == ('back'):
					backroom_bad()
		while d6.lower() not in ['warehouse']:
			print("Please enter a valid command...")
			d6 = input("> ")
			if d6.lower() == ('warehouse'):
				_s5c()
				input("")
				_s6()
				d7 = input("> ")
				if d7.lower() == ('front'):
					_s6a()
					_s6b()
					d8 = input("> ")
					if d8.lower() == ('ask'):
						_s6c()
						d9 = input("> ")
						if d9.lower() == ('backdoor'):
							backroom_bad()
						while d9.lower() not in ['backdoor']:
							print("Please enter a valid command...")
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
					while d8.lower() not in ['ask']:
						print("Please enter a valid command...")
						d8 = input("> ")
						if d8.lower() == ('ask'):
							_s6c()
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
							while d9.lower() not in ['backdoor']:
								print("Please enter a valid command...")
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()

				elif d7.lower() == ('back'):
					backroom_bad()

				while d7.lower() not in ['front', 'back']:
					d7 = input("> ")
					if d7.lower() == ('front'):
						_s6a()
						_s6b()
						d8 = input("> ")
						if d8.lower() == ('ask'):
							_s6c()
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
							while d9.lower() not in ['backdoor']:
								print("Please enter a valid command...")
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
						while d8.lower() not in ['ask']:
							print("Please enter a valid command...")
							d8 = input("> ")
							if d8.lower() == ('ask'):
								_s6c()
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
								while d9.lower() not in ['backdoor']:
									print("Please enter a valid command...")
									d9 = input("> ")
									if d9.lower() == ('backdoor'):
										backroom_bad()

					elif d7.lower() == ('back'):
						backroom_bad()

	while d5.lower() not in ['take']:
		print("Please enter a valid command...")
		d5 = input("> ")
		if d5.lower() == ('take'):
			_s5b()
			d6 = input("> ")
			if d6.lower() == ('warehouse'):
				_s5c()
				input("")
				_s6()
				d7 = input("> ")
				if d7.lower() == ('front'):
					_s6a()
					_s6b()
					d8 = input("> ")
					if d8.lower() == ('ask'):
						_s6c()
						d9 = input("> ")
						if d9.lower() == ('backdoor'):
							backroom_bad()
						while d9.lower() not in ['backdoor']:
							print("Please enter a valid command...")
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
					while d8.lower() not in ['ask']:
						print("Please enter a valid command...")
						d8 = input("> ")
						if d8.lower() == ('ask'):
							_s6c()
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
							while d9.lower() not in ['backdoor']:
								print("Please enter a valid command...")
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()

				elif d7.lower() == ('back'):
					backroom_bad()

				while d7.lower() not in ['front', 'back']:
					d7 = input("> ")
					if d7.lower() == ('front'):
						_s6a()
						_s6b()
						d8 = input("> ")
						if d8.lower() == ('ask'):
							_s6c()
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
							while d9.lower() not in ['backdoor']:
								print("Please enter a valid command...")
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
						while d8.lower() not in ['ask']:
							print("Please enter a valid command...")
							d8 = input("> ")
							if d8.lower() == ('ask'):
								_s6c()
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
								while d9.lower() not in ['backdoor']:
									print("Please enter a valid command...")
									d9 = input("> ")
									if d9.lower() == ('backdoor'):
										backroom_bad()

					elif d7.lower() == ('back'):
						backroom_bad()
			while d6.lower() not in ['warehouse']:
				print("Please enter a valid command...")
				d6 = input("> ")
				if d6.lower() == ('warehouse'):
					_s5c()
					input("")
					_s6()
					d7 = input("> ")
					if d7.lower() == ('front'):
						_s6a()
						_s6b()
						d8 = input("> ")
						if d8.lower() == ('ask'):
							_s6c()
							d9 = input("> ")
							if d9.lower() == ('backdoor'):
								backroom_bad()
							while d9.lower() not in ['backdoor']:
								print("Please enter a valid command...")
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
						while d8.lower() not in ['ask']:
							print("Please enter a valid command...")
							d8 = input("> ")
							if d8.lower() == ('ask'):
								_s6c()
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
								while d9.lower() not in ['backdoor']:
									print("Please enter a valid command...")
									d9 = input("> ")
									if d9.lower() == ('backdoor'):
										backroom_bad()

					elif d7.lower() == ('back'):
						backroom_bad()

					while d7.lower() not in ['front', 'back']:
						d7 = input("> ")
						if d7.lower() == ('front'):
							_s6a()
							_s6b()
							d8 = input("> ")
							if d8.lower() == ('ask'):
								_s6c()
								d9 = input("> ")
								if d9.lower() == ('backdoor'):
									backroom_bad()
								while d9.lower() not in ['backdoor']:
									print("Please enter a valid command...")
									d9 = input("> ")
									if d9.lower() == ('backdoor'):
										backroom_bad()
							while d8.lower() not in ['ask']:
								print("Please enter a valid command...")
								d8 = input("> ")
								if d8.lower() == ('ask'):
									_s6c()
									d9 = input("> ")
									if d9.lower() == ('backdoor'):
										backroom_bad()
									while d9.lower() not in ['backdoor']:
										print("Please enter a valid command...")
										d9 = input("> ")
										if d9.lower() == ('backdoor'):
											backroom_bad()

						elif d7.lower() == ('back'):
							backroom_bad()

def backroom_good():
	os.system('cls')
	_s5d()
	d6 = input("> ")
	if d6.lower() == ('one'):
		_s6d()
	elif d6.lower() == ('two'):
		_s5e()
		_s6e()
		d7 = input("> ")
		if d7.lower() == ('documents'):
			_s6f()
		elif d7.lower() == ('clothes'):
			_s6g()
		elif d7.lower() == ('mop'):
			_s6h()
		elif d7.lower() == ('leave'):
			good_end()
		while d7.lower() not in ['leave']:
			x1 = "*What do you wanna do?\n"
			average_speed(x1)
			d7 = input("> ")
			if d7.lower() == ('documents'):
				_s6f()
			elif d7.lower() == ('clothes'):
				_s6g()
			elif d7.lower() == ('mop'):
				_s6h()
			elif d7.lower() == ('leave'):
				good_end()
	while d6.lower() not in ['two']:
		print("Please choose another option...")
		d6 = input("> ")
		if d6.lower() == ('one'):
			_s6d()
		elif d6.lower() == ('two'):
			_s5e()
			_s6e()
			d7 = input("> ")
			if d7.lower() == ('documents'):
				_s6f()
			elif d7.lower() == ('clothes'):
				_s6g()
			elif d7.lower() == ('mop'):
				_s6h()
			elif d7.lower() == ('leave'):
				good_end()
			while d7.lower() not in ['leave']:
				x1 = "*What do you wanna do?\n"
				average_speed(x1)
				d7 = input("> ")
				if d7.lower() == ('documents'):
					_s6f()
				elif d7.lower() == ('clothes'):
					_s6g()
				elif d7.lower() == ('mop'):
					_s6h()
				elif d7.lower() == ('leave'):
					good_end()

def good_end():
	os.system('cls')
	_s7()
	_s7a()
	_s7b()
	input('\nCongratulations! You captured the "killer" and won the Good Ending...!\n')
	_s7c()
	play_again()

def backroom_bad():
	os.system('cls')
	_s5d()
	d6 = input("> ")
	if d6.lower() == ('one'):
		_s6d()
		_s5g()
		d7 = input("> ")
		if d7.lower() == ('use'):
			_s5f()
			_s8()
			_s8a()
			_s8b()
			_s8c()
			d8 = input("> ")
			if d8.lower() == ('run'):
				_s8d()
				bad_end()
			elif d8.lower() == ('stay'):
				_s8e()
				_s8f()
				d9 = input("> ")
				if d9.lower() == ('use'):
					secret_end()
				while d9.lower() not in ['use']:
					print("U S E  I T  N O W .")
					d9 = input("> ")
					if d9.lower() == ('use'):
						secret_end()
			while d8.lower() not in ['run','stay']:
				print("Please choose another option...")
				d8 = input("> ")
				if d8.lower() == ('run'):
					_s8d()
					bad_end()
				elif d8.lower() == ('stay'):
					_s8e()
					_s8f()
					d9 = input("> ")
					if d9.lower() == ('use'):
						secret_end()
					while d9.lower() not in ['use']:
						print("U S E  I T  N O W .")
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
		while d7.lower() not in ['use']:
			print("Please choose another option...")
			d7 = input("> ")
			if d7.lower() == ('use'):
				_s5f()
				_s8()
				_s8a()
				_s8b()
				_s8c()
				d8 = input("> ")
				if d8.lower() == ('run'):
					_s8d()
					bad_end()
				elif d8.lower() == ('stay'):
					_s8e()
					_s8f()
					d9 = input("> ")
					if d9.lower() == ('use'):
						secret_end()
					while d9.lower() not in ['use']:
						print("U S E  I T  N O W .")
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
				while d8.lower() not in ['run','stay']:
					print("Please choose another option...")
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
	elif d6.lower() == ('two'):
		_s5e()
		_s6e()
		d7 = input("> ")
		if d7.lower() == ('documents'):
			_s6f()
		elif d7.lower() == ('clothes'):
			_s6g()
		elif d7.lower() == ('mop'):
			_s6h1()
		elif d7.lower() == ('one'):
			_s6d()
			_s5g()
			d7 = input("> ")
			if d7.lower() == ('use'):
				_s5f()
				_s8()
				_s8a()
				_s8b()
				_s8c()
				d8 = input("> ")
				if d8.lower() == ('run'):
					_s8d()
					bad_end()
				elif d8.lower() == ('stay'):
					_s8e()
					_s8f()
					d9 = input("> ")
					if d9.lower() == ('use'):
						secret_end()
					while d9.lower() not in ['use']:
						print("U S E  I T  N O W .")
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
				while d8.lower() not in ['run','stay']:
					print("Please choose another option...")
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
			while d7.lower() not in ['use']:
				print("Please choose another option...")
				d7 = input("> ")
				if d7.lower() == ('use'):
					_s5f()
					_s8()
					_s8a()
					_s8b()
					_s8c()
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
					while d8.lower() not in ['run','stay']:
						print("Please choose another option...")
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()

		while d7.lower() not in ['one']:
			x1 = "*What do you wanna do?\n"
			average_speed(x1)
			d7 = input("> ")
			if d7.lower() == ('documents'):
				_s6f()
			elif d7.lower() == ('clothes'):
				_s6g()
			elif d7.lower() == ('mop'):
				_s6h1()
			elif d7.lower() == ('one'):
				_s6d()
				_s5g()
				d7 = input("> ")
				if d7.lower() == ('use'):
					_s5f()
					_s8()
					_s8a()
					_s8b()
					_s8c()
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
					while d8.lower() not in ['run','stay']:
						print("Please choose another option...")
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
				while d7.lower() not in ['use']:
					print("Please choose another option...")
					d7 = input("> ")
					if d7.lower() == ('use'):
						_s5f()
						_s8()
						_s8a()
						_s8b()
						_s8c()
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
						while d8.lower() not in ['run','stay']:
							print("Please choose another option...")
							d8 = input("> ")
							if d8.lower() == ('run'):
								_s8d()
								bad_end()
							elif d8.lower() == ('stay'):
								_s8e()
								_s8f()
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
								while d9.lower() not in ['use']:
									print("U S E  I T  N O W .")
									d9 = input("> ")
									if d9.lower() == ('use'):
										secret_end()

	while d6.lower() not in ['one','two']:
		print("Please choose a valid option...")
		d6 = input("> ")
		if d6.lower() == ('one'):
			_s6d()
			_s5g()
			d7 = input("> ")
			if d7.lower() == ('use'):
				_s5f()
				_s8()
				_s8a()
				_s8b()
				_s8c()
				d8 = input("> ")
				if d8.lower() == ('run'):
					_s8d()
					bad_end()
				elif d8.lower() == ('stay'):
					_s8e()
					_s8f()
					d9 = input("> ")
					if d9.lower() == ('use'):
						secret_end()
					while d9.lower() not in ['use']:
						print("U S E  I T  N O W .")
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
				while d8.lower() not in ['run','stay']:
					print("Please choose another option...")
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
			while d7.lower() not in ['use']:
				print("Please choose another option...")
				d7 = input("> ")
				if d7.lower() == ('use'):
					_s5f()
					_s8()
					_s8a()
					_s8b()
					_s8c()
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
					while d8.lower() not in ['run','stay']:
						print("Please choose another option...")
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
		elif d6.lower() == ('two'):
			_s5e()
			_s6e()
			d7 = input("> ")
			if d7.lower() == ('documents'):
				_s6f()
			elif d7.lower() == ('clothes'):
				_s6g()
			elif d7.lower() == ('mop'):
				_s6h1()
			elif d7.lower() == ('one'):
				_s6d()
				_s5g()
				d7 = input("> ")
				if d7.lower() == ('use'):
					_s5f()
					_s8()
					_s8a()
					_s8b()
					_s8c()
					d8 = input("> ")
					if d8.lower() == ('run'):
						_s8d()
						bad_end()
					elif d8.lower() == ('stay'):
						_s8e()
						_s8f()
						d9 = input("> ")
						if d9.lower() == ('use'):
							secret_end()
						while d9.lower() not in ['use']:
							print("U S E  I T  N O W .")
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
					while d8.lower() not in ['run','stay']:
						print("Please choose another option...")
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
				while d7.lower() not in ['use']:
					print("Please choose another option...")
					d7 = input("> ")
					if d7.lower() == ('use'):
						_s5f()
						_s8()
						_s8a()
						_s8b()
						_s8c()
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
						while d8.lower() not in ['run','stay']:
							print("Please choose another option...")
							d8 = input("> ")
							if d8.lower() == ('run'):
								_s8d()
								bad_end()
							elif d8.lower() == ('stay'):
								_s8e()
								_s8f()
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
								while d9.lower() not in ['use']:
									print("U S E  I T  N O W .")
									d9 = input("> ")
									if d9.lower() == ('use'):
										secret_end()

			while d7.lower() not in ['one']:
				x1 = "*What do you wanna do?\n"
				average_speed(x1)
				d7 = input("> ")
				if d7.lower() == ('documents'):
					_s6f()
				elif d7.lower() == ('clothes'):
					_s6g()
				elif d7.lower() == ('mop'):
					_s6h1()
				elif d7.lower() == ('one'):
					_s6d()
					_s5g()
					d7 = input("> ")
					if d7.lower() == ('use'):
						_s5f()
						_s8()
						_s8a()
						_s8b()
						_s8c()
						d8 = input("> ")
						if d8.lower() == ('run'):
							_s8d()
							bad_end()
						elif d8.lower() == ('stay'):
							_s8e()
							_s8f()
							d9 = input("> ")
							if d9.lower() == ('use'):
								secret_end()
							while d9.lower() not in ['use']:
								print("U S E  I T  N O W .")
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
						while d8.lower() not in ['run','stay']:
							print("Please choose another option...")
							d8 = input("> ")
							if d8.lower() == ('run'):
								_s8d()
								bad_end()
							elif d8.lower() == ('stay'):
								_s8e()
								_s8f()
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
								while d9.lower() not in ['use']:
									print("U S E  I T  N O W .")
									d9 = input("> ")
									if d9.lower() == ('use'):
										secret_end()
					while d7.lower() not in ['use']:
						print("Please choose another option...")
						d7 = input("> ")
						if d7.lower() == ('use'):
							_s5f()
							_s8()
							_s8a()
							_s8b()
							_s8c()
							d8 = input("> ")
							if d8.lower() == ('run'):
								_s8d()
								bad_end()
							elif d8.lower() == ('stay'):
								_s8e()
								_s8f()
								d9 = input("> ")
								if d9.lower() == ('use'):
									secret_end()
								while d9.lower() not in ['use']:
									print("U S E  I T  N O W .")
									d9 = input("> ")
									if d9.lower() == ('use'):
										secret_end()
							while d8.lower() not in ['run','stay']:
								print("Please choose another option...")
								d8 = input("> ")
								if d8.lower() == ('run'):
									_s8d()
									bad_end()
								elif d8.lower() == ('stay'):
									_s8e()
									_s8f()
									d9 = input("> ")
									if d9.lower() == ('use'):
										secret_end()
									while d9.lower() not in ['use']:
										print("U S E  I T  N O W .")
										d9 = input("> ")
										if d9.lower() == ('use'):
											secret_end()

def bad_end():
	os.system('cls')
	_s9()
	_s9a()
	_s9b()
	_s9c()
	play_again()

def secret_end():
	os.system('cls')
	_s10()
	_s10a()
	_s10d()
	_s10b()
	_s10c()
	play_again()

#### ALL SPEECHES ##### Added this a day later, a better substitute than the first proccess.. :(
#### MAKES THE MAIN CODE SHORTER ####

#### PART 2 S4@ ####
def _s4():
	s4 = "\n#Part2#\n*It has been 2 days since you accepted the investigation, you have been looking through both cases\n for the past 2 days but still found nothing.\n*Maybe, you should begin a physical 'investigation?'(investigate)\n"
	average_speed(s4)
def _s4a():
	s4a = "*You went to a local Family Mart to buy a box of apple juice. As you were paying, you heard a\n young customer talking to a phone.\n"
	average_speed(s4a)
def _s4b():
	s4b = "<TEENAGER> Yeah dude, I was looking for some place to do some skating and I found this abandoned\n warehouse and it smelled like sh#t! I don't know how that old guy handles it\n but it smells like dead rats!\n*You found yourself curious so you asked the teenager.\n<"+myPlayer.name.upper()+"> Hey, I heard you talking, can you tell me where you found the abandoned warehouse?\n<TEENAGER> Huh? hold on dude some creep is listening to us talk.\n"
	slow_speed(s4b)
def _s4c():
	s4c = "*The boy looked at you. You explained that you are a detective and after some time explaining and\n proving it with your ID, the boy told you the whereabouts of the warehouse.\n"
	average_speed(s4c)
def _s4d():
	s4d = "\n*!Information Acquired!*\n [Old Guy]\n [Abandoned Warehouse]\n"
	fast_speed(s4d)
def _s4e():
	s4e = "\n*After acquiring new information and connecting it to your current case, you went outside of the Family Mart.\n*What do you wanna do? (Available Areas : Warehouse | Office)\n"
	average_speed(s4e)
def _s4f():
	s4f = "*You drove to the location of the warehouse.....\n"
	slow_speed(s4f)
def _s4g():
	s4g = "*You walked back to your office.....\n"
	slow_speed(s4g)

#### PART 3 S5@ ####
def _s5():
	s5 = "\n#Part3#\n*You went back to your office and decided to conduct more research about the said warehouse.\n Upon searching, you noticed that you searched for this website before, weird.\n"
	average_speed(s5)
def _s5a():
	s5a = "*While researching about the location, you opened some drawers and found a key and a crumbled piece of paper\n titled 3010, in it lists 30 people. 'Take' it?\n"
	average_speed(s5a)
def _s5b():
	s5b = "*You took the items, thinking it might be important to the case. Where do you wanna go? (warehouse)\n"
	average_speed(s5b)
def _s5c():
	s5c = "*Before leaving you brought a loaf of bread to eat for lunch, you cut it in ten slices.\n After eating, you started driving.\n"
	average_speed(s5c)
def _s5d():
	s5d = "\n#Backrooms#\n*You went inside the backrooms. After walking for 10 minutes, you stumbled upon a hidden hallway.\n*The smell is worst.\n*There are two doors. Door 'one' is tight shut and locked, and the smell is stronger.\n Door 'two' seems to be open. Where do you wanna go?\n"
	average_speed(s5d)
def _s5e():
	s5e = "*You walked in the second door.\n"
	average_speed(s5e)
def _s5f():
	s5f = "*You unlocked the first door.\n"
	average_speed(s5f)
def _s5g():
	s5g = "*You still have the key that you found in the office.\n*'Use' it?\n"
	average_speed(s5g)

#### PART 3 ALTERNATE S6@ ####
def _s6():
	s6 = "\n#Part3#\n*You arrived at the warehouse, it smelled bad.. You looked around and saw that\n the front door is open, although you also saw that the backdoor is slightly open.\n*Where do you wanna go? (front | back)\n"
	average_speed(s6)
def _s6a(): #If entered front door
	s6a = "*You entered the warehouse through the front door and found an old man cleaning.\n*The old man was startled by your presence but you quickly explained why you were there.\n*He gave you some information about himself and the warehouse.\n*You learned that he has been a caretaker there for about 10 years and that old warehouse used to contain\n different illegal chemicals that can cause people to be delusional.\n"
	average_speed(s6a)
def _s6b():
	s6b = "*The longer you talked, the smell got worse. What do you wanna do? (ask)\n"
	average_speed(s6b)
def _s6c():
	s6c = "*You decided to ask what the terrible smell was.\n""<"+myPlayer.name.upper()+"> Sorry to interrupt but may I ask what that smell is? How long has it been smelling like this?\n<CARETAKER> What smell?\n""<"+myPlayer.name.upper()+"> Nevermind. I will take my leave now.\n*You found the Caretaker fairly suspicious after talking to him, but you cant bare to ask more as the smell was getting to you so you left.\n*You exited through the front door. What do you wanna do? (backdoor)\n"
	fast_speed(s6c)
def _s6d():
	s6d = "*You can't enter this room. The door is locked.\n"
	average_speed(s6d)
def _s6e():
	s6e = "*As you look around you saw a total mess of 'documents', dirty 'clothes', and a red stained 'mop'.\n*What do you wanna do?\n"
	average_speed(s6e)
def _s6f(): #Documents
	s6f = "*You examined the documents.\n*As you read through everything, you learned that all this documents were about the\n past of this warehouse and the people that used to work here.\n"
	average_speed(s6f)
def _s6g(): #Clothes
	s6g = "*You examined the clothes.\n*As you inspected the discarded clothes, you learned that all of these were worn by office workers.\n Perhaps, those who used to work here?\n"
	average_speed(s6g)
def _s6h(): #Mop
	s6h = "*You examined the mop.\n*Those are not just red stains. Those are blood. Perhaps it was used by the killer to clean the mess.\n\n*!Information Acquired!*\n [Documents]\n [Clothes]\n [Mop]\n\n<"+myPlayer.name.upper()+"> I think I know who it is. Let's 'leave'.\n\n"
	average_speed(s6h)	

def _s6h1(): #Mop
	s6h1 = "*You examined the mop.\n*Those are not just red stains. Those are blood. Perhaps it was used by the killer to clean the mess.\n\n*!Information Acquired!*\n [Documents]\n [Clothes]\n [Mop]\n\n<"+myPlayer.name.upper()+"> I think I know who it is. But let's check door 'one' just to be sure.\n\n"
	average_speed(s6h1)	

#### PART 4 S7@ #### GOOD ENDING
def _s7():
	s7 = "\n#Part4#\n*Two days later..\n*After submitting the information to the police, the Caretaker was soon arrested\n for kidnapping and murder.\n*Due to the Caretaker's carelessness, fingerprints were founded\non the blood stained mop.\n"
	average_speed(s7)
def _s7a():
	s7a = "After the Caretaker was arrested, you were swarmed by the media.\n"
	average_speed(s7a)
def _s7b():
	s7b = "<REPORTER> Detective "+myPlayer.name.upper()+"! How did you discover the notorious killer of 3010?!\n<"+myPlayer.name.upper()+"> Well, I cannot disclose that as these things are confidential,\n but what I could say is, he was someone out for revenge to the people\n who used to work there, as I have learned from the evidences.\n"
	average_speed(s7b)
def _s7c():
	s7c = "###############\n# GOOD ENDING #\n###############"
	fast_speed(s7c)
	
#### PART 5 S8@ ####
def _s8():
	s8 = "*The room seems familiar, like an office. Your.. Office.\n*But it feels different.\n*You looked around.\n"
	average_speed(s8)
def _s8a():
	s8a = "<"+myPlayer.name.upper()+"> Weird.. Why does this room feel similar to my office..?\n I've never been here before.. And.. October 30, why is my birthday encircled on this callendar..? Weird.\n"
	average_speed(s8a)
def _s8b():
	s8b = "*As you inspect the room and checking the drawers, something caught your attention.\n A 'trapdoor' behind the table.\n"
	average_speed(s8b)
def _s8c():
	s8c = "*You entered the hidden room. The smell is worse.\n Inside the room is an incinerator, and the remains of people with specifically 10 cuts,\n so this is where the smell came from..\n*Your heart sank, you can't accept the horror. You threw up out of disgust.\n*Do you want to 'run' or 'stay'?\n"
	average_speed(s8c)

def _s8d():
	s8d = "*You ran away......\n"
	slow_speed(s8d)

def _s8e():
	s8e = "*You decided to stay.\n*You tried to keep your calm. You looked around...\n*As you looked around, slowly, the memories come flooding your mind.\n*You remember everything. Y o u  a r e  t h e  k i l l e r . .\n"
	slow_speed(s8e)
def _s8f():
	s8f = "\n*Your head hurts.\n\n*You panicked.\n\n*Everything is so confusing..\n\n*We don't want anyone knowing this..\n\n*You saw a match that's used to light the incinerator. 'Use' it. N O W\n"	
	slow_speed(s8f)

#### PART 5 S9@ #### BAD ENDING
def _s9():
	s9 = "\n#Part4#\n*Two days later..\n*You're deeply traumatized. You can't sleep anymore.\n You reported back to the police but due to the lack of proof, they ignored you.\n"
	average_speed(s9)
def _s9a():
	s9a = "*You keep remembering the faces of the dead remains, it is full horror.\n*Your stomach felt weak...\n* y o u  c a n ' t  t a k e  i t  a n y m o r e . .\n"
	slow_speed(s9a)
def _s9b():
	s9b = "\n<!!BREAKING NEWS!!> Local Detective found DEAD in their appartment! Locals said they heard gunshots the night before,\n the officials are now invesitagating the scene.\n It was believed that the detective killed themself. No evidences are yet found as to why they did that...\n"
	average_speed(s9b)
def _s9c():
	s9c = "\n##############\n# BAD ENDING #\n##############\n"
	fast_speed(s9c)

#### PART 8 S10@ #### SECRET ENDING
def _s10():
	s10 = "\n#Part4#\n\n### BOOM! ###\n"
	average_speed(s10)
def _s10a():
	s10a = "<!!BREAKING NEWS!!> Old Warehouse burned down! Caretaker missing!?\n Officials stated that a gas tank exploaded causing the whole place to burn down.\n No further evidences have been found leading to the events.\n"
	average_speed(s10a)
def _s10d():
	s10d = "\n*A week later...\n*The search history, the method of cutting, the keys in your drawer.\n Even the time you lost your memories connecting to the time the kidnapping stopped.\n*It all points to you. You, are the killer of 3010.\n"
	average_speed(s10d)
def _s10b():	
	s10b = "*Its you.\n Hi.\n You're the problem its you.\n"
	slow_speed(s10b)
def _s10c():
	s10c = "\n#################\n# SECRET ENDING #\n#################\n"
	fast_speed(s10c)

#######################################

title_screen()