//response schema for rest api
export class StockDetail{
    constructor(
        public stId:number,
        public productName:string,
        public stockCount:number,
        public currentPrice:number
        ){}
}