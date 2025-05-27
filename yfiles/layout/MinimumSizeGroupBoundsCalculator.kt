// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.NodeList
import yfiles.algorithms.Rectangle2D
import yfiles.algorithms.YDimension
import yfiles.lang.ClassMetadata

/**
 * This [IGroupBoundsCalculator] allows custom insets for group nodes and guarantees that their provided minimum sizes will be maintained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [MinimumSizeGroupBoundsCalculator] with the given key as [minimum node size key][minimumNodeSizeDpKey].
 * @param [minimumNodeSizeDpKey] the [IDataProvider][yfiles.algorithms.IDataProvider] key to use as [minimum size key][minimumNodeSizeDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator%23MinimumSizeGroupBoundsCalculator-constructor-MinimumSizeGroupBoundsCalculator(Object)">Online Documentation</a>
 */
external open class MinimumSizeGroupBoundsCalculator  ( minimumNodeSizeDpKey: NodeDpKey<YDimension>  = definedExternally) : InsetsGroupBoundsCalculator {

/**
 * Gets or sets the default minimum size (width and height) for group nodes.
 * 
 * The default minimum size is used if the [IDataProvider][yfiles.algorithms.IDataProvider] registered with the [minimum size key][minimumNodeSizeDpKey] does not contain a mapping for a group node.
 * 
 * Default value - `YDimension(0,0)`. A [YDimension] object with width and height set to `0`.
 * @throws ArgumentError if the given [YDimension] is `null`
 * @see [minimumNodeSizeDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator%23defaultMinimumNodeSize">Online Documentation</a>
 */
open var defaultMinimumNodeSize: YDimension
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that is used to access the minimum sizes for the group nodes.
 * 
 * Default value - [GroupingKeys.MINIMUM_NODE_SIZE_DP_KEY]
 * @see [defaultMinimumNodeSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator%23minimumNodeSizeDpKey">Online Documentation</a>
 */
open var minimumNodeSizeDpKey: NodeDpKey<YDimension>?
/**
 * Gets or sets how the nodes are resized horizontally if the calculated width is smaller than the preferred minimum width of a group node.
 * 
 * Default value - `0.5`. Nodes grow equally to the left and to the right, while the center remains unchanged.
 * @throws ArgumentError if the given value does not lie within `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator%23xAlignment">Online Documentation</a>
 */
open var xAlignment: Double
/**
 * Gets or sets how the nodes are resized vertically if the calculated height is smaller than the preferred minimum height of a group node.
 * 
 * Default value - `0.5`. Nodes grow equally upwards and downwards, while the center remains unchanged.
 * @throws ArgumentError if the given value does not lie within `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator%23yAlignment">Online Documentation</a>
 */
open var yAlignment: Double
/**
 * Calculates the bounds of the given group node, enlarges the bounds by the insets associated with the group node and makes sure that the size of the group node obeys the associated minimum size.
 * @param [graph] the input graph
 * @param [groupNode] the group node whose bounds will be calculated
 * @param [children] a [NodeList] containing the nodes that reside inside the group node
 * @return a [Rectangle2D] instance that describes the bounds of the group node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumSizeGroupBoundsCalculator%23MinimumSizeGroupBoundsCalculator-method-calculateBounds">Online Documentation</a>
 */
 override   fun calculateBounds( graph: LayoutGraph ,
 groupNode: Node ,
 children: NodeList ):Rectangle2D

companion object : ClassMetadata<MinimumSizeGroupBoundsCalculator> {
}
}

inline fun MinimumSizeGroupBoundsCalculator(
    block: MinimumSizeGroupBoundsCalculator.() -> Unit
): MinimumSizeGroupBoundsCalculator {
    return MinimumSizeGroupBoundsCalculator()
        .apply(block)
}
