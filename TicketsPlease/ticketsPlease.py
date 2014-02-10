

liner = raw_input()
quarters = 2
linenum = 0
done=False
for charr in liner:
	if charr == 'e' or charr == 'E':
		quarters += 2
	elif charr == 'f' or charr == 'F':
		quarters -= 2
	else:
		print(char)
		print("sucks")
	linenum += 1
	if quarters < 0:
		done=True
		print(linenum)	
		break
if not done:
	print(-1)
