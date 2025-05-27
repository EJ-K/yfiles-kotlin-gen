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
import yfiles.algorithms.YInsets
import yfiles.lang.ClassMetadata

/**
 * This [IGroupBoundsCalculator] calculates the bounds of group nodes and allows to specify custom insets for each group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator">Online Documentation</a>
 * 
 * @constructor Constructs an instance of [InsetsGroupBoundsCalculator] using the given [IDataProvider][yfiles.algorithms.IDataProvider] key as [group node insets key][groupNodeInsetsDpKey] and the given insets as [default insets][defaultInsets].
 * @param [groupNodeInsetsDpKey] the [IDataProvider][yfiles.algorithms.IDataProvider] key to use as [insets key][groupNodeInsetsDpKey]
 * @param [defaultInsets] the insets to use as [default insets][defaultInsets]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23InsetsGroupBoundsCalculator-constructor-InsetsGroupBoundsCalculator">Online Documentation</a>
 */
external open class InsetsGroupBoundsCalculator  ( groupNodeInsetsDpKey: NodeDpKey<YInsets>  = definedExternally,
 defaultInsets: YInsets  = definedExternally) : IGroupBoundsCalculator {

/**
 * Gets or sets whether or not the labels of edges contained in a group are considered while calculating the bounds of the group node.
 * 
 * Default value - `false`. Edge labels are not considered during the group bounds calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23considerEdgeLabels">Online Documentation</a>
 */
open var considerEdgeLabels: Boolean
/**
 * Gets or sets whether or not the calculation of the bounds of a group node considers the [NodeHalos][NodeHalo] associated with the group's child nodes.
 * 
 * Default value - `true`. [NodeHalo]s are considered during the group bounds calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23considerNodeHalos">Online Documentation</a>
 */
open var considerNodeHalos: Boolean
/**
 * Gets or sets whether or not the labels of nodes contained in a group are considered while calculating the bounds of the group node.
 * 
 * Default value - `false`. Node labels are not considered during the group bounds calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the default insets that will be used if the [IDataProvider][yfiles.algorithms.IDataProvider] registered with the [insets key][groupNodeInsetsDpKey] does not contain a mapping for a specific node.
 * 
 * Default value - `Insets(15,15,15,15)`. The insets from the top, left, bottom and right are set to `15`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23defaultInsets">Online Documentation</a>
 */
open var defaultInsets: YInsets
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that is used to access the insets for the group nodes.
 * 
 * Default value - [GroupingKeys.GROUP_NODE_INSETS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23groupNodeInsetsDpKey">Online Documentation</a>
 */
open var groupNodeInsetsDpKey: NodeDpKey<YInsets>?
/**
 * Calculates the bounds of the given group node and enlarges the bounds by the insets associated with the group node.
 * @param [graph] the input graph
 * @param [groupNode] the group node whose bounds will be calculated
 * @param [children] a [NodeList] containing the nodes that reside inside the group node
 * @return a [Rectangle2D] instance that describes the bounds of the group node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23InsetsGroupBoundsCalculator-method-calculateBounds">Online Documentation</a>
 */
 override   fun calculateBounds( graph: LayoutGraph ,
 groupNode: Node ,
 children: NodeList ):Rectangle2D
/**
 * Enlarges the given graph bounds by the insets associated with the given group node.
 * @param [graph] the input graph
 * @param [groupNode] the group node whose bounds should be enlarged
 * @param [children] the list of nodes that the given group node contains
 * @param [bounds] a [Rectangle2D] instance representing the bounds of the given group node
 * @return a [Rectangle2D] instance representing the enlarged bounds of the given group node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsetsGroupBoundsCalculator%23InsetsGroupBoundsCalculator-method-createEnlargedBounds">Online Documentation</a>
 */
 open protected   fun createEnlargedBounds( graph: LayoutGraph ,
 groupNode: Node ,
 children: NodeList ,
 bounds: Rectangle2D ):Rectangle2D

companion object : ClassMetadata<InsetsGroupBoundsCalculator> {
}
}

inline fun InsetsGroupBoundsCalculator(
    block: InsetsGroupBoundsCalculator.() -> Unit
): InsetsGroupBoundsCalculator {
    return InsetsGroupBoundsCalculator()
        .apply(block)
}
