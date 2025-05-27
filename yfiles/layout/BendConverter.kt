// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeList
import yfiles.lang.ClassMetadata

/**
 * [BendConverter] replaces edge bends with dummy nodes for the [core layout algorithm][coreLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter">Online Documentation</a>
 * 
 * @constructor Creates a new [BendConverter] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-constructor-BendConverter()">Online Documentation</a>
 */
external open class BendConverter  () : ILayoutStage {
/**
 * Creates a new instance of [BendConverter] with the given [core layout algorithm][coreLayout].
 * @param [core] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-constructor-BendConverter(ILayoutAlgorithm)">Online Documentation</a>
 */
 constructor( core: ILayoutAlgorithm?  = definedExternally)
/**
 * Creates a new [BendConverter] instance with the given size as the width and height for the dummy nodes.
 * @param [size] the size for the dummy nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-constructor-BendConverter(number)">Online Documentation</a>
 */
 constructor( size: Double )

/**
 * Gets or sets whether or not the selection state of the original edge should be adopted by its replacement edges.
 * 
 * Default value - `true`. The selection state of the original edge is applied to all corresponding dummy edges.
 * @see [affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23adoptAffectedEdges">Online Documentation</a>
 */
open var adoptAffectedEdges: Boolean
/**
 * Gets or sets whether or not edge grouping information of the original edge should be adopted by its replacement edges.
 * 
 * Default value - `true`. Original edge grouping information is applied to the dummy edges.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23adoptEdgeGroups">Online Documentation</a>
 */
open var adoptEdgeGroups: Boolean
/**
 * Gets or sets whether or not the associated [PortConstraint]s of the original edge should be adopted by its replacement edges.
 * 
 * Default value - `true`. [PortConstraint]s of the original edges are applied to the dummy edges.
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23adoptPortConstraints">Online Documentation</a>
 */
open var adoptPortConstraints: Boolean
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] which identifies edges as *selected*.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [adoptAffectedEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the core layout algorithm that is wrapped by this [ILayoutStage].
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Adds information to newly created dummy nodes.
 * @param [graph] the input graph
 * @param [edge] the edge whose bends were replaced by the given dummy nodes
 * @param [dummyNodes] the dummy nodes representing the bends of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-method-addedPathForEdge">Online Documentation</a>
 */
 open protected   fun addedPathForEdge( graph: LayoutGraph ,
 edge: Edge ,
 dummyNodes: NodeList )
/**
 * Replaces all bends in the current [scope][DEFAULT_AFFECTED_EDGES_DP_KEY] with dummy nodes before invoking the [core layout algorithm][coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Prepares the graph before calling the [core layout algorithm][coreLayout].
 * @param [graph] the input graph
 * @see [restore]
 * @see [adoptAffectedEdges]
 * @see [adoptPortConstraints]
 * @see [adoptEdgeGroups]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-method-prepare">Online Documentation</a>
 */
 open protected   fun prepare( graph: LayoutGraph )
/**
 * Restores the structure of the graph after the [core layout algorithm][coreLayout] has finished.
 * @param [graph] the graph arranged by the [core layout algorithm][coreLayout]
 * @see [prepare]
 * @see [adoptAffectedEdges]
 * @see [adoptPortConstraints]
 * @see [adoptEdgeGroups]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23BendConverter-method-restore">Online Documentation</a>
 */
 open protected   fun restore( graph: LayoutGraph )

companion object : ClassMetadata<BendConverter> {
/**
 * A data provider key for specifying the set of edges for which this stage will replace bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendConverter%23DEFAULT_AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val DEFAULT_AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}
