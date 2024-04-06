package id.bobipermanasandi.githubuser.data.remote.response

import com.google.gson.annotations.SerializedName

data class UserSearchResponse(

	@field:SerializedName("total_count")
	val totalCount: Int,

	@field:SerializedName("incomplete_results")
	val incompleteResults: Boolean,

	@field:SerializedName("items")
	val items: List<UserItem>
)

data class UserItem(

	@field:SerializedName("login")
	val login: String,

	@field:SerializedName("score")
	val score: Int,

	@field:SerializedName("avatar_url")
	val avatarUrl: String,

	@field:SerializedName("id")
	val id: Int,

)