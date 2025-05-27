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
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * This [INodePlacer] places the subtrees such that the overall aspect ratio of the arranged subtree will be close to a preferred aspect ratio.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [AspectRatioNodePlacer] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23AspectRatioNodePlacer-constructor-AspectRatioNodePlacer">Online Documentation</a>
 */
external open class AspectRatioNodePlacer  () : NodePlacerBase, IFromSketchNodePlacer {

/**
 * Gets or sets the preferred aspect ratio (width/height) for the subtrees.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified aspect ratio is `0` or negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23aspectRatio">Online Documentation</a>
 */
open var aspectRatio: Double
/**
 * Gets or sets how rows/columns are aligned with each other.
 * 
 * Default value - [FillStyle.LEADING]
 * @throws ArgumentError if an unknown fill style is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23fillStyle">Online Documentation</a>
 */
open var fillStyle: FillStyle
/**
 * Gets or sets whether child nodes are distributed in horizontal rows or vertical columns.
 * 
 * Default value - `false`. The child nodes are placed in vertical columns.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23horizontal">Online Documentation</a>
 */
open var horizontal: Boolean
/**
 * Gets or sets the horizontal distance between the [SubtreeShape]s.
 * 
 * Default value - `40`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23horizontalDistance">Online Documentation</a>
 */
open var horizontalDistance: Double
/**
 * Gets or sets the vertical distance between the [SubtreeShape]s.
 * 
 * Default value - `40`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23verticalDistance">Online Documentation</a>
 */
open var verticalDistance: Double
/**
 * Creates an edge [IComparer] which takes the initial coordinates of the nodes into account.
 * @return the [IComparer] for the edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23AspectRatioNodePlacer-method-createFromSketchComparer">Online Documentation</a>
 */
 override   fun createFromSketchComparer():IComparer<Node>
/**
 * Determines a connector direction for the given child node depending on whether or not the child nodes are arranged [horizontally][horizontal].
 * @param [child] the child node
 * @return [ParentConnectorDirection.NORTH] if nodes are placed in rows, [ParentConnectorDirection.WEST] otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23AspectRatioNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Arranges the [SubtreeShapes][SubtreeShape] of children of the local root node in rows or columns that fit the specified [aspect ratio][aspectRatio].
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction of the connector
 * @return the [SubtreeShape] containing the local root and all its subtrees
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioNodePlacer%23AspectRatioNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<AspectRatioNodePlacer> {
}
}

inline fun AspectRatioNodePlacer(
    block: AspectRatioNodePlacer.() -> Unit
): AspectRatioNodePlacer {
    return AspectRatioNodePlacer()
        .apply(block)
}
