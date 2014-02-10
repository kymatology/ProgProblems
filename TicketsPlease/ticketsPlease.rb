line = gets
num = 1
person = 0
for char in line.split("") do
	if char == 'e'
		num += 1
	elsif 
		num -= 1
	end
	person += 1
	if num < 0
		break
	end
end
if person == line.length
	puts "-1"
else
	puts person
end
