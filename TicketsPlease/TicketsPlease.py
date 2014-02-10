#!/usr/bin/python2
""" This is a qucik python review and a pylint test """

def main():
    """ This function preforms the function speciified
        on the probelm sheet"""
    liner = raw_input()
    quarters = 2
    linenum = 0
    done = False
    for charr in liner:
        if charr == 'e' or charr == 'E':
            quarters += 2
        elif charr == 'f' or charr == 'F':
            quarters -= 2
        linenum += 1
        if quarters < 0:
            done = True
            print linenum
        break
    if not done:
        print -1

if __name__ == '__main__':
    main()
