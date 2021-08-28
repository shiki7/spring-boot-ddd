# spring-boot-ddd


## レイヤードアーキテクチャ

### インタフェース層（UI)
- 外部からの操作によるコマンドを受ける＋レスポンスを返す
### アプリケーション層
- ドメイン層を用いてデータを整理して、インタフェースへデータを返す
### ドメイン層
- ビジネスロジックを実装
### インフラストラクチャ層
- DBなど外部との通信を行う
