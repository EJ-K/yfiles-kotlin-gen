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

/**
 * The [SimpleNodePlacer] arranges all children of a local root in a single row.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [SimpleNodePlacer] instance that uses the given [modification matrix][RotatableNodePlacerBase.modificationMatrix] and [root alignment][rootAlignment].
 * @param [modificationMatrix] the transformation matrix for this [RotatableNodePlacerBase]
 * @param [rootAlignment] the alignment for the local root in relation to its subtrees
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23SimpleNodePlacer-constructor-SimpleNodePlacer">Online Documentation</a>
 */
external open class SimpleNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally,
 rootAlignment: RootNodeAlignment?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Gets or sets whether or not a bus is created in the space between the parent and its children.
 * 
 * Default value - `false`. The edges leave the local root on the left or right side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23createBus">Online Documentation</a>
 */
open var createBus: Boolean
/**
 * Gets or sets the minimum (non-negative) distance between edge segments that are routed orthogonally in the channel between the root node and the child nodes.
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified distance is smaller than `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23minimumChannelSegmentDistance">Online Documentation</a>
 */
open var minimumChannelSegmentDistance: Double
/**
 * Gets or sets the [RootAlignment][RootNodeAlignment] that defines how the root node is aligned with its children and their shapes.
 * 
 * Default value - [RootNodeAlignment.TRAILING]
 * @throws ArgumentError if the given root alignment is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23rootAlignment">Online Documentation</a>
 */
open var rootAlignment: RootNodeAlignment
/**
 * Gets or sets the relative vertical alignment of nodes with the same parent.
 * 
 * Default value - `-1`. Nodes are not aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double
/**
 * Provides [ParentConnectorDirection.NORTH] as connector direction for the child nodes.
 * @param [child] the child node
 * @return [ParentConnectorDirection.NORTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23SimpleNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Places the children of the local root node in a single row.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape containing the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNodePlacer%23SimpleNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<SimpleNodePlacer> {
}
}

inline fun SimpleNodePlacer(
    block: SimpleNodePlacer.() -> Unit
): SimpleNodePlacer {
    return SimpleNodePlacer()
        .apply(block)
}
