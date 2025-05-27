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
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IEnumerator
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class associates [PortCandidate]s with the nodes of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet">Online Documentation</a>
 * 
 * @constructor Creates a new empty [PortCandidateSet] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-constructor-PortCandidateSet">Online Documentation</a>
 */
external open class PortCandidateSet  () : YObject {

/**
 * Gets the total number of connections allowed by the [PortCandidate]s described by this [PortCandidateSet] or `0x7FFFFFFF` if the number is unbounded.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23connectionCount">Online Documentation</a>
 */
open val connectionCount: Int
/**
 * Gets an [IEnumerator] over the list of candidate [entries][IPortCandidateSetEntry] of this [PortCandidateSet].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23entries">Online Documentation</a>
 */
open val entries: IEnumerator<IPortCandidateSetEntry>
/**
 * Adds a [PortCandidate] with the given capacity to this [PortCandidateSet].
 * @param [p] the [PortCandidate] to add
 * @param [connections] the capacity of the given port
 * @throws ArgumentError if the given capacity is less than or equal to zero
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-method-add">Online Documentation</a>
 */
 open   fun add( p: PortCandidate ,
 connections: Int  = definedExternally)
/**
 * Creates a [IPortCandidateMatcher] that retrieves [entries][IPortCandidateSetEntry] from this [PortCandidateSet].
 * @return a new [IPortCandidateMatcher] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-method-createMatcher">Online Documentation</a>
 */
 open   fun createMatcher():IPortCandidateMatcher
/**
 * Calculates the penalty cost for the usage of the given [entry][IPortCandidateSetEntry] and the given parameters.
 * @param [entry] the entry for which the cost is computed
 * @param [edge] the edge that will connect to the [PortCandidate] associated with the entry
 * @param [source] `true` if the given edge connects to its source node, `false` otherwise
 * @param [xOffset] the preferred X-offset of the port relative to the center of the node
 * @param [yOffset] the preferred Y-offset of the port relative to the center of the node
 * @return the penalty cost for the usage of the given [IPortCandidateSetEntry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-method-getCost">Online Documentation</a>
 */
 open protected   fun getCost( entry: IPortCandidateSetEntry ,
 edge: Edge ,
 source: Boolean ,
 xOffset: Double ,
 yOffset: Double ):Double
/**
 * Calculates the priority of the given [entry][IPortCandidateSetEntry].
 * @param [entry] the entry for which the cost is computed
 * @param [edge] the edge that will connect to the [PortCandidate] associated with the entry
 * @param [source] `true` if the given edge connects to its source node, `false` otherwise
 * @return the priority of the given [IPortCandidateSetEntry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-method-getPriority">Online Documentation</a>
 */
 open protected   fun getPriority( entry: IPortCandidateSetEntry ,
 edge: Edge ,
 source: Boolean ):Int
/**
 * Removes the given [entry][IPortCandidateSetEntry] from the list of candidate entries.
 * @param [entry] the entry to remove
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-method-remove">Online Documentation</a>
 */
 open   fun remove( entry: IPortCandidateSetEntry )

/**
 * Removes the given [entry][IPortCandidateSetEntry] from the list of candidate entries.
 * @param [entry] the entry to remove
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23PortCandidateSet-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( entry: IPortCandidateSetEntry )

companion object : ClassMetadata<PortCandidateSet> {
/**
 * A data provider key for specifying a port candidate set for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateSet%23NODE_PORT_CANDIDATE_SET_DP_KEY">Online Documentation</a>
 */
 val NODE_PORT_CANDIDATE_SET_DP_KEY: NodeDpKey<PortCandidateSet>
}
}
