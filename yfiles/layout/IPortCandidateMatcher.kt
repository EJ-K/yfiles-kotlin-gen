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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [IPortCandidateMatcher] retrieves the best matching [entries][IPortCandidateSetEntry] from a [PortCandidateSet].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateMatcher">Online Documentation</a>
 */
external interface IPortCandidateMatcher : YObject {
/**
 * Returns the next best matching [IPortCandidateSetEntry].
 * @return a matching [IPortCandidateSetEntry] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateMatcher%23IPortCandidateMatcher-method-findMatchingCandidate()">Online Documentation</a>
 */
   fun findMatchingCandidate():IPortCandidateSetEntry
/**
 * Returns the next best matching [IPortCandidateSetEntry] for the given parameters.
 * @param [edge] the edge for which to find a candidate
 * @param [source] `true` if the given edge connects to its source node, `false` otherwise
 * @param [directionMask] any combination of default directions defined in [PortCandidate]
 * @return a matching [IPortCandidateSetEntry] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateMatcher%23IPortCandidateMatcher-method-findMatchingCandidate(Edge,boolean,PortDirections)">Online Documentation</a>
 */
   fun findMatchingCandidate( edge: Edge ,
 source: Boolean ,
 directionMask: PortDirections ):IPortCandidateSetEntry
/**
 * Returns the next best matching [IPortCandidateSetEntry] for the given parameters.
 * @param [edge] the edge for which to find a candidate
 * @param [source] `true` if the given edge connects to its source node, `false` otherwise
 * @param [xOffset] the preferred X-offset of the port relative to the center of the node
 * @param [yOffset] the preferred Y-offset of the port relative to the center of the node
 * @param [directionMask] any combination of default directions defined in [PortCandidate]
 * @return a matching [IPortCandidateSetEntry] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateMatcher%23IPortCandidateMatcher-method-findMatchingCandidate(Edge,boolean,number,number,PortDirections)">Online Documentation</a>
 */
   fun findMatchingCandidate( edge: Edge ,
 source: Boolean ,
 xOffset: Double ,
 yOffset: Double ,
 directionMask: PortDirections ):IPortCandidateSetEntry

companion object : InterfaceMetadata<IPortCandidateMatcher> {
}
}
