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
import yfiles.algorithms.IEdgeCursor
import yfiles.algorithms.IEdgeMap
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The [PortConstraintConfigurator] provides the possibility to create [PortConstraint]s according to the initial connecting side of an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintConfigurator">Online Documentation</a>
 * 
 * @constructor Creates a new [PortConstraintConfigurator] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintConfigurator%23PortConstraintConfigurator-constructor-PortConstraintConfigurator">Online Documentation</a>
 */
external open class PortConstraintConfigurator  () : YObject {

/**
 * Creates a [PortConstraint] for the given edge.
 * @param [graph] the input graph
 * @param [edge] the edge
 * @param [source] `true` if a source [PortConstraint] for the given edge will be created, `false` for a target [PortConstraint]
 * @param [strong] `true` if a strong [PortConstraint] is created, `false` for a weak [PortConstraint]
 * @return the [PortConstraint] for the given edge whose side is retrieved from the initial drawing
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintConfigurator%23PortConstraintConfigurator-method-createPortConstraintFromSketch">Online Documentation</a>
 */
 open   fun createPortConstraintFromSketch( graph: LayoutGraph ,
 edge: Edge ,
 source: Boolean ,
 strong: Boolean ):PortConstraint
/**
 * Creates weak [PortConstraint]s for all edges of the given graph.
 * @param [graph] the input graph
 * @param [spcMap] the [IEdgeMap] that will be used for storing the source [PortConstraint]s of the edges
 * @param [tpcMap] the [IEdgeMap] that will be used for storing the target [PortConstraint]s of the edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintConfigurator%23PortConstraintConfigurator-method-createPortConstraintsFromSketch(LayoutGraph,IEdgeMap,IEdgeMap)">Online Documentation</a>
 */
 open   fun createPortConstraintsFromSketch( graph: LayoutGraph ,
 spcMap: IEdgeMap<PortConstraint> ,
 tpcMap: IEdgeMap<PortConstraint> )
/**
 * Creates [PortConstraint]s for some edges of the given graph.
 * @param [graph] the input graph
 * @param [ec] the [IEdgeCursor] that provides access to the edges for which to create [PortConstraint]s
 * @param [spcMap] the [IEdgeMap] that will be used for storing the source [PortConstraint]s of the edges
 * @param [strongSP] `true` if strong source [PortConstraint]s should be assigned, `false` otherwise
 * @param [tpcMap] the [IEdgeMap] that will be used for storing the target [PortConstraint]s of the edges
 * @param [strongTP] `true` if strong target [PortConstraint]s should be assigned, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintConfigurator%23PortConstraintConfigurator-method-createPortConstraintsFromSketch(LayoutGraph,IEdgeCursor,IEdgeMap,boolean,IEdgeMap,boolean)">Online Documentation</a>
 */
 open   fun createPortConstraintsFromSketch( graph: LayoutGraph ,
 ec: IEdgeCursor ,
 spcMap: IEdgeMap<PortConstraint> ,
 strongSP: Boolean ,
 tpcMap: IEdgeMap<PortConstraint> ,
 strongTP: Boolean )

companion object : ClassMetadata<PortConstraintConfigurator> {
}
}
