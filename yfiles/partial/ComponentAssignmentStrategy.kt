// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [ClearAreaLayout.componentAssignmentStrategy]
 * @see [FillAreaLayout.componentAssignmentStrategy]
 * @see [PartialLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy">Online Documentation</a>
 */
external sealed class ComponentAssignmentStrategy: YEnum<ComponentAssignmentStrategy> {
   companion object: EnumMetadata<ComponentAssignmentStrategy> {
       /**
 * A component assignment strategy that assigns each node to a separate subgraph component.
 * 
 * Value - `0`
 * @see [PartialLayout.componentAssignmentStrategy]
 * @see [ClearAreaLayout.componentAssignmentStrategy]
 * @see [FillAreaLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23SINGLE">Online Documentation</a>
 */
val SINGLE: ComponentAssignmentStrategy

/**
 * A component assignment strategy where the subgraph components correspond to the connected components of the graph.
 * 
 * Value - `1`
 * @see [PartialLayout.componentAssignmentStrategy]
 * @see [ClearAreaLayout.componentAssignmentStrategy]
 * @see [FillAreaLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23CONNECTED">Online Documentation</a>
 */
val CONNECTED: ComponentAssignmentStrategy

/**
 * A component assignment strategy where the subgraph components correspond to the clusters computed by a clustering algorithm based on [edge betweenness centrality][yfiles.algorithms.Groups.edgeBetweennessClustering].
 * 
 * Value - `2`
 * @see [PartialLayout.componentAssignmentStrategy]
 * @see [ClearAreaLayout.componentAssignmentStrategy]
 * @see [FillAreaLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23CLUSTERING">Online Documentation</a>
 */
val CLUSTERING: ComponentAssignmentStrategy

/**
 * A component assignment strategy where the subgraph components are defined by the user.
 * 
 * Value - `3`
 * @see [PartialLayout.componentAssignmentStrategy]
 * @see [ClearAreaLayout.componentAssignmentStrategy]
 * @see [FillAreaLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23CUSTOMIZED">Online Documentation</a>
 */
val CUSTOMIZED: ComponentAssignmentStrategy
   }
}
