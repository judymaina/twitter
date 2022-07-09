package io.trell.twitter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class AccountRVAdapter (var accountList:List<Account>): RecyclerView.Adapter<AccountViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.accounts_list_item, parent, false)
        return AccountViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        var currentAccount = accountList.get(position)
        holder.tvName.text = currentAccount.name
        holder.tvhandle.text = currentAccount.handle
        holder.tvTweet.text = currentAccount.tweet
        holder.tvcomment.text = currentAccount.Comment
        holder.tvretweet.text = currentAccount.retweet
        holder.tvlikes.text = currentAccount.likes
        holder.tvShare.text = currentAccount.share
    }

    override fun getItemCount(): Int {
        return accountList.size

    }
}
class  AccountViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvhandle=itemView.findViewById<TextView>(R.id.tvhandle)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvcomment=itemView.findViewById<TextView>(R.id.tvcomment)
    var tvretweet=itemView.findViewById<TextView>(R.id.tvretweet)
    var tvlikes=itemView.findViewById<TextView>(R.id.tvlike)
    var tvShare=itemView.findViewById<TextView>(R.id.tvShare)
    var ivMe=itemView.findViewById<ImageView>(R.id.ivMe)
    var ivComment=itemView.findViewById<ImageView>(R.id.ivComment)
    var ivretweet=itemView.findViewById<ImageView>(R.id.ivretweet)
    var ivShare=itemView.findViewById<ImageView>(R.id.ivShares)
    var ivlikes=itemView.findViewById<ImageView>(R.id.ivlikes)

}








