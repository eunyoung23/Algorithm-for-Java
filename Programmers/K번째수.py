def solution(array, commands):
    answer = []
    
    for com in commands:
        start=com[0]
        end=com[1]
        idx=com[2]
        
        newArr=array[start-1:end]
        newArr.sort()
        
        answer.append(newArr[idx-1])
    
    
    return answer
