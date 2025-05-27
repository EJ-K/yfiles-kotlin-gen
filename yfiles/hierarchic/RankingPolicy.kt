// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [TopologicalLayerer.rankingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankingPolicy">Online Documentation</a>
 */
external sealed class RankingPolicy: YEnum<RankingPolicy> {
   companion object: EnumMetadata<RankingPolicy> {
       /**
 * A ranking policy that specifies that nodes are not re-ranked after the initial topological layering step.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankingPolicy%23NO_RERANKING">Online Documentation</a>
 */
val NO_RERANKING: RankingPolicy

/**
 * A ranking policy that specifies that nodes are re-ranked by an inexpensive downshift rule.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankingPolicy%23DOWN_SHIFT">Online Documentation</a>
 */
val DOWN_SHIFT: RankingPolicy

/**
 * A ranking policy that specifies that nodes are re-ranked by finding a spanning tree that contains only tight (length `1`) edges.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankingPolicy%23TIGHT_TREE">Online Documentation</a>
 */
val TIGHT_TREE: RankingPolicy
   }
}
