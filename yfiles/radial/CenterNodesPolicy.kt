// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [RadialLayout.centerNodesPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy">Online Documentation</a>
 */
external sealed class CenterNodesPolicy: YEnum<CenterNodesPolicy> {
   companion object: EnumMetadata<CenterNodesPolicy> {
       /**
 * Specifier for a center nodes policy which chooses all nodes with in-degree equal to `0` as center nodes.
 * 
 * Value - `0`
 * @see [RadialLayout.centerNodesPolicy]
 * @see [Trees.getRoot][yfiles.algorithms.Trees.getRoot]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23DIRECTED">Online Documentation</a>
 */
val DIRECTED: CenterNodesPolicy

/**
 * Specifier for a center nodes policy which chooses the node with the highest centrality as center node.
 * 
 * Value - `1`
 * @see [RadialLayout.centerNodesPolicy]
 * @see [Trees.getCenterRoot][yfiles.algorithms.Trees.getCenterRoot]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23CENTRALITY">Online Documentation</a>
 */
val CENTRALITY: CenterNodesPolicy

/**
 * Specifier for a center nodes policy which chooses the node with the highest weighted centrality as center node.
 * 
 * Value - `2`
 * @see [RadialLayout.centerNodesPolicy]
 * @see [Trees.getWeightedCenterNode][yfiles.algorithms.Trees.getWeightedCenterNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23WEIGHTED_CENTRALITY">Online Documentation</a>
 */
val WEIGHTED_CENTRALITY: CenterNodesPolicy

/**
 * Specifier for a center nodes policy which uses center nodes specified by the user.
 * 
 * Value - `3`
 * @see [RadialLayout.centerNodesPolicy]
 * @see [RadialLayout.centerNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23CUSTOM">Online Documentation</a>
 */
val CUSTOM: CenterNodesPolicy
   }
}
