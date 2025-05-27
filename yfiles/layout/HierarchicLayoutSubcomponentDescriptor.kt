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
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [HierarchicLayoutSubcomponentDescriptor] defines settings for subcomponents that are arranged by a different layout algorithm than their containing graph for [HierarchicLayout][yfiles.hierarchic.HierarchicLayout].
 * @see [HierarchicLayout.SUBCOMPONENT_DESCRIPTOR_DP_KEY][yfiles.hierarchic.HierarchicLayout.SUBCOMPONENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [HierarchicLayoutSubcomponentDescriptor] instance with the specified settings.
 * @param [layoutAlgorithm] The layout algorithm handling the layout of the graph induced by the subcomponent.
 * @param [placementPolicy] The policy for placing the component into the layout context of the remaining graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentDescriptor%23HierarchicLayoutSubcomponentDescriptor-constructor-HierarchicLayoutSubcomponentDescriptor">Online Documentation</a>
 * 
 * @property layoutAlgorithm
 * Gets or sets the [ILayoutAlgorithm] for the subgraph that is induced by the nodes associated with this descriptor.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentDescriptor%23layoutAlgorithm">Online Documentation</a>
 * 
 * @property placementPolicy
 * Gets or sets the policy defining how the subcomponent is placed within the layout context of the remaining graph.
 * 
 * Default value - [HierarchicLayoutSubcomponentPlacementPolicy.AUTOMATIC]. It is automatically determined how the subcomponent is placed.
 * @throws ArgumentError if an unknown placement policy is given.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentDescriptor%23placementPolicy">Online Documentation</a>
 */
external open class HierarchicLayoutSubcomponentDescriptor  (
open var layoutAlgorithm: ILayoutAlgorithm? = definedExternally,
open var placementPolicy: HierarchicLayoutSubcomponentPlacementPolicy = definedExternally) : YObject {

/**
 * Determines if there is a unique node outside the subcomponent whose removal would disconnect the component from the remaining graph and returns the node if it exists.
 * @param [graph] the graph containing the subcomponent.
 * @return the only node outside the subcomponent with edges connecting to nodes within the subcomponent if such a node exists, `null` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentDescriptor%23HierarchicLayoutSubcomponentDescriptor-method-getConnectorNode">Online Documentation</a>
 */
 open   fun getConnectorNode( graph: LayoutGraph ):Node?

companion object : ClassMetadata<HierarchicLayoutSubcomponentDescriptor> {
}
}

inline fun HierarchicLayoutSubcomponentDescriptor(
    block: HierarchicLayoutSubcomponentDescriptor.() -> Unit
): HierarchicLayoutSubcomponentDescriptor {
    return HierarchicLayoutSubcomponentDescriptor()
        .apply(block)
}
