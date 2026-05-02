class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hm = Counter(nums)

        heap = []
        for key, freq in hm.items():
            heapq.heappush(heap, (-freq, key))
        
        res = []
        for _ in range(k):
            freq, num = heapq.heappop(heap)
            res.append(num)

        return res