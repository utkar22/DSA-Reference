class Stack:
    def __init__(self):
        self.stack=[]
    def push(self,data):
        self.stack.append(data)
    def pop(self,data):
        if len(self.stack)==0:
            return None
        return self.stack.pop(-1)
