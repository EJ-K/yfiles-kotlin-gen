// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.genealogy

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm arranges genealogical graphs (family trees).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FamilyTreeLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23FamilyTreeLayout-constructor-FamilyTreeLayout">Online Documentation</a>
 */
external open class FamilyTreeLayout  () : MultiStageLayout {

/**
 * Gets or sets the vertical alignment of the individual nodes in the same generation.
 * 
 * Default value - [VerticalNodeAlignment.CENTER]
 * @throws ArgumentError if the specified alignment is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23alignment">Online Documentation</a>
 */
open var alignment: VerticalNodeAlignment
/**
 * Gets or sets the order of individuals in the same generation (siblings, partners) based on their sex.
 * 
 * Default value - [FamilyMembersSortingPolicy.NO_SORTING]
 * @throws ArgumentError if the specified order is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23familyMembersSortingPolicy">Online Documentation</a>
 */
open var familyMembersSortingPolicy: FamilyMembersSortingPolicy
/**
 * Gets or sets whether or not [FamilyType.FAMILY] nodes are placed between or below the partners.
 * 
 * Default value - `false`. [FamilyType.FAMILY] nodes are placed between the partners.
 * @see [FamilyType.FAMILY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23familyNodesAlwaysBelow">Online Documentation</a>
 */
open var familyNodesAlwaysBelow: Boolean
/**
 * Gets or sets the offset by which a [FamilyType.FAMILY] node is shifted down if its parents are not direct neighbors.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given offset is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23offsetForFamilyNodes">Online Documentation</a>
 */
open var offsetForFamilyNodes: Double
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing parallel edges is activated.
 * 
 * Default value - `true`. The stage that routes parallel edges is activated.
 * @see [MultiStageLayout.parallelEdgeRouterEnabled]
 * @see [MultiStageLayout.parallelEdgeRouter]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23parallelEdgeRouterEnabled">Online Documentation</a>
 */
override var parallelEdgeRouterEnabled: Boolean
/**
 * Gets or sets whether or not [FamilyType.FAMILY] nodes of individuals that have only children but no partners are placed below this individual or next to it.
 * 
 * Default value - `true`. [FamilyType.FAMILY] nodes are placed below single parents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23partnerlessBelow">Online Documentation</a>
 */
open var partnerlessBelow: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Gets or sets the spacing between two nodes representing members of the same family in one generation.
 * 
 * Default value - `30`
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23spacingBetweenFamilyMembers">Online Documentation</a>
 */
open var spacingBetweenFamilyMembers: Double
/**
 * Gets or sets the [layout algorithm][ILayoutAlgorithm] that is responsible for the layout between family groups.
 * 
 * Default value - [HierarchicLayout][yfiles.hierarchic.HierarchicLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23topLayout">Online Documentation</a>
 */
open var topLayout: ILayoutAlgorithm?
/**
 * Applies a family tree layout to the given graph.
 * @param [graph] the input graph
 * @throws InvalidOperationError if no [IDataProvider][yfiles.algorithms.IDataProvider] is registered using [FAMILY_TYPE_DP_KEY]
 * @throws InvalidGraphStructureError if a [FamilyType.FAMILY] node has more than two parents or two nodes of the same type are linked together
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23FamilyTreeLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<FamilyTreeLayout> {
/**
 * A data provider key for assigning a node type for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayout%23FAMILY_TYPE_DP_KEY">Online Documentation</a>
 */
 val FAMILY_TYPE_DP_KEY: NodeDpKey<FamilyType>
}
}

inline fun FamilyTreeLayout(
    block: FamilyTreeLayout.() -> Unit
): FamilyTreeLayout {
    return FamilyTreeLayout()
        .apply(block)
}
