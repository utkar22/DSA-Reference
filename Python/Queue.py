class Queue:
    def __init__(self):
        self.queue=[]
    def enqueue(self, data):
        self.queue.append(data)
    def dequeue(self):
        if len(self.queue)==0:
            return None
        data=self.queue.pop(0)
        return (data)
