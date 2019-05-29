# 十八啦 coding dojo

## 活動內容

+ 已 pair programming 形式進行，一組 7 分鐘
  + 一位 driver (輸入程式碼的人)，一位 navigator (審查程式碼的人)
  + 下一輪時 navigator 變成 driver 跟下一個 navigator 再變成一組
+ 採自願排隊上台輪流 pair
+ 本次 coding dojo 採用的題目是 [PokerHands](https://en.wikipedia.org/wiki/List_of_poker_hands) 

## 活動目標

+ 上台膽量
+ 不是做完，是從別人身上偷學一些思考及技巧

## 活動規則

+ 要寫測試
+ 有紅燈時要先修測試
+ 有紅燈時不能重構
+ 要寫 production code 要有測試
+ 每一輪時間到的時候至少要可以編譯

## PokerHands 遊戲需求

+ 撲克牌有點數 2-9 A J Q K
+ 花色有 梅花(Clubs) 方塊(Diamonds) 紅桃(Hearts) 黑桃(Spades)
    + 梅花J -> CJ
    + 方塊2 -> D2
    + 紅桃A -> HA
    + 黑桃K -> SK
+ 牌組
    + 同花順 (StraightFlush)
    + 鐵支 (FourOfAKind)
    + 葫蘆 (FullHouse)   
    + 同花 (Flush)
    + 順子 (Straight)
    + 三條 (ThreeOfAKind)
    + 兩對 (TwoPair)
    + 一對 (OnePair)
    + 沒有組合 (HighCard)
+ input 五張牌的字串 e.g. CA,C2,C3,C4,C5 回傳牌組名稱 
+ test case
    + CA,C2,C3,C4,C5 -> StraightFlush
    + CA,DA,HA,SA,C2 -> FourOfAKind
    + CA,DA,HA,C2,C2 -> FullHouse
    + CA,C3,C5,C7,C9 -> Flush
    + CA,D2,C3,C4,C5 -> Straight
    + CA,DA,HA,C2,C3 -> ThreeOfAKind
    + CA,DA,H3,C2,H2 -> TwoPair
    + CA,DA,H3,C4,H5 -> OnePair
    + CA,D3,C5,C7,C9 -> HighCard
