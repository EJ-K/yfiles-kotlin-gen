// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents the page rank values as computed by [PageRank].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRankResult">Online Documentation</a>
 */
external  class PageRankResult 
private constructor () : YObject {

/**
 * Gets a mapping from each node to its page rank value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRankResult%23pageRank">Online Documentation</a>
 */
final val pageRank: ResultItemMapping<INode, Double>
/**
 * Gets the sum of all page ranks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRankResult%23rankSum">Online Documentation</a>
 */
final val rankSum: Double

companion object : ClassMetadata<PageRankResult> {
}
}
