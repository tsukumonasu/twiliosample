# twiliosample

AWS Lambdaからtwilioで電話をかけるKotlinのサンプルプログラム

## 電話のかけ方
0. JetBrain ideaでクローンしたフォルダを開いてください。
1. Example.kt にtwilioアカウント情報とtwilioで取得した電話番号とかける先の電話番号を入れてください。
2. Gradleプロジェクトをビルドしてください。
3. buildZip タスクをを実行してください。
4. "build\distributions\twilio-1.0-SNAPSHOT.zip" をAWS Lambdaにアップロードしてください。
5. AWS Lambdaを以下のように設定してください。

```
Runtime Java 8
Handler jp.cloudpack.naiki.twilio.sample.App::handler
Existing role lambda_basic_execution（作ってください）
Description A starter AWS Lambda function.（そのまま）
```