// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * A [FreeNodePlacer] is a simple *pseudo*-placer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FreeNodePlacer] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePlacer%23FreeNodePlacer-constructor-FreeNodePlacer">Online Documentation</a>
 */
external open class FreeNodePlacer  () : RotatableNodePlacerBase {

/**
 * Creates a [IProcessor] that will change all descending [INodePlacer]s to [FreeNodePlacer].
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the current root node handled by this [INodePlacer]
 * @return the [IProcessor] suitable for [FreeNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePlacer%23FreeNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Determines a connector direction for the given child node.
 * @param [child] the child node
 * @return [ParentConnectorDirection.NONE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePlacer%23FreeNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Merges the rotated shapes of the given local root and its children and routes the edges between them.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePlacer%23FreeNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<FreeNodePlacer> {
}
}

inline fun FreeNodePlacer(
    block: FreeNodePlacer.() -> Unit
): FreeNodePlacer {
    return FreeNodePlacer()
        .apply(block)
}
