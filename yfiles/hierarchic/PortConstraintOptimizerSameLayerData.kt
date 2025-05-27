// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This static class provides information about the same-layer structures created by class [PortConstraintOptimizerBase].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerSameLayerData">Online Documentation</a>
 * 
 * @constructor Creates a new [PortConstraintOptimizerSameLayerData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerSameLayerData%23PortConstraintOptimizerSameLayerData-constructor-PortConstraintOptimizerSameLayerData">Online Documentation</a>
 */
external open class PortConstraintOptimizerSameLayerData  () : YObject {

/**
 * Gets all dummy nodes of this [PortConstraintOptimizerSameLayerData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerSameLayerData%23dummyNodes">Online Documentation</a>
 */
open val dummyNodes: NodeList
/**
 * Adds a given dummy [Node] to this [PortConstraintOptimizerSameLayerData] instance and associates it with the given original (same-layer) [Edge].
 * @param [sameLayerDummy] a dummy node
 * @param [originalEdge] the original (same-layer) edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerSameLayerData%23PortConstraintOptimizerSameLayerData-method-addDummyNode">Online Documentation</a>
 */
 open   fun addDummyNode( sameLayerDummy: Node ,
 originalEdge: Edge )
/**
 * Returns the original (same-layer) edge associated with the given dummy [Node].
 * @param [sameLayerDummy] a given dummy node
 * @return the original (same-layer) edge associated with the given dummy node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerSameLayerData%23PortConstraintOptimizerSameLayerData-method-getOriginalEdge">Online Documentation</a>
 */
 open   fun getOriginalEdge( sameLayerDummy: Node ):Edge

companion object : ClassMetadata<PortConstraintOptimizerSameLayerData> {
}
}
