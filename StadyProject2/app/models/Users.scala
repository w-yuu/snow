package models

import anorm._
 /** Userテーブル用モデル. */
case class Users(id: Pk[Long], name: String, email: String, password: String)