package com.ifs21021.lostfounds.data.remote.response

import com.google.gson.annotations.SerializedName

data class DelcomTodoResponse(

	@field:SerializedName("data")
	val data: DataTodoResponse,

	@field:SerializedName("success")
	val success: Boolean,

	@field:SerializedName("message")
	val message: String
)

data class DataTodoResponse(

	@field:SerializedName("lost_found")
	val todo: TodoResponse
)

data class TodoResponse(

	@field:SerializedName("cover")
	val cover: String?,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("status")
	val status: String,

	@field:SerializedName("is_completed")
	var isCompleted: Int
)
