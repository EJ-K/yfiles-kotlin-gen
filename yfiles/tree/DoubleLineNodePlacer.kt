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
 * The [DoubleLineNodePlacer] arranges the children of a local root alternating in two lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleLineNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [DoubleLineNodePlacer] instance whose direction is specified by the given modification matrix.
 * @param [modificationMatrix] the transformation matrix for this [RotatableNodePlacerBase]. [RotatableNodePlacerMatrix.DEFAULT] if none is provided.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleLineNodePlacer%23DoubleLineNodePlacer-constructor-DoubleLineNodePlacer">Online Documentation</a>
 */
external open class DoubleLineNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Gets or sets the ratio of the [spacing][RotatableNodePlacerBase.spacing] between the root and the children in the upper line and the spacing between the two lines of subtrees.
 * 
 * Default value - `0.33`. The distance between the two lines of subtrees is a third of the distance between the root and the upper line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleLineNodePlacer%23doubleLineSpacingRatio">Online Documentation</a>
 */
open var doubleLineSpacingRatio: Double
/**
 * Gets or sets the [RootAlginment][RootNodeAlignment] that defines how the root node is aligned with its children and their shapes.
 * 
 * Default value - [RootNodeAlignment.CENTER]
 * @throws ArgumentError if the given root alignment is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleLineNodePlacer%23rootAlignment">Online Documentation</a>
 */
open var rootAlignment: RootNodeAlignment
/**
 * Returns [ParentConnectorDirection.NORTH] for every given child node.
 * @return [ParentConnectorDirection.NORTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleLineNodePlacer%23DoubleLineNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Places the children of the given local root alternating in two horizontal lines.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleLineNodePlacer%23DoubleLineNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<DoubleLineNodePlacer> {
}
}

inline fun DoubleLineNodePlacer(
    block: DoubleLineNodePlacer.() -> Unit
): DoubleLineNodePlacer {
    return DoubleLineNodePlacer()
        .apply(block)
}
