class Shop:
    order = 0
    d_price = 0
    visitor = 0
    avg_visitor = 0

    def total_price(self):
        return '총 결제금액은' + str(self.order * self.d_price) + '입니다.'

    def total_count(self, avg_visitor=100):
        return '오늘은 평균보다' + str(abs(avg_visitor - self.visitor)) + '명 많이 들어왔어요'
