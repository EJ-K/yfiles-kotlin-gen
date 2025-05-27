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
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YDimension
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph

/**
 * This layout algorithm produces tree map layouts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TreeMapLayout] class with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23TreeMapLayout-constructor-TreeMapLayout">Online Documentation</a>
 */
external open class TreeMapLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets the target aspect ratio of the [squarified tiling policy][TilingPolicy.SQUARIFIED].
 * 
 * Default value - `1`. The target is to draw square nodes.
 * @throws ArgumentError if the given aspect ratio is smaller than `1`
 * @see [TilingPolicy.SQUARIFIED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23aspectRatio">Online Documentation</a>
 */
open var aspectRatio: Double
/**
 * Gets or sets the minimum size (height and width) a node in the tree map must have.
 * 
 * Default value - [YDimension]. Minimum width and height are `10.0`.
 * @throws ArgumentError if the width or height of the given size is smaller than `5` or if the given minimum size is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23minimumNodeSize">Online Documentation</a>
 */
open var minimumNodeSize: YDimension
/**
 * Gets or sets the [IComparer] that defines the order in which child nodes are placed inside their parent node.
 * 
 * Default value - [NodeWeightComparer]. Nodes are ordered with respect to their weight (higher weight first).
 * @throws ArgumentError if the given [IComparer] is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23nodeComparer">Online Documentation</a>
 */
open var nodeComparer: IComparer<in Node>
/**
 * Gets or sets the desired dimension of the root rectangle into which all nodes are placed.
 * 
 * Default value - [YDimension]. Preferred width and height are `600`.
 * @throws ArgumentError if the given size is `null` or if its width/height value is less than or equal to `zero`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23preferredSize">Online Documentation</a>
 */
open var preferredSize: YDimension
/**
 * Gets or sets the spacing between nodes of the same hierarchy.
 * 
 * Default value - `5`
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23spacing">Online Documentation</a>
 */
open var spacing: Double
/**
 * Gets or sets the tiling policy that defines how the input is divided into sub-rectangles.
 * 
 * Default value - [TilingPolicy.SQUARIFIED]
 * @throws ArgumentError if an unknown policy is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23tilingPolicy">Online Documentation</a>
 */
open var tilingPolicy: TilingPolicy
/**
 * Arranges the given input graph as a tree map.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23TreeMapLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<TreeMapLayout> {
/**
 * A data provider key for specifying the weight of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23NODE_WEIGHT_DP_KEY">Online Documentation</a>
 */
 val NODE_WEIGHT_DP_KEY: NodeDpKey<Double>
}
}

inline fun TreeMapLayout(
    block: TreeMapLayout.() -> Unit
): TreeMapLayout {
    return TreeMapLayout()
        .apply(block)
}
