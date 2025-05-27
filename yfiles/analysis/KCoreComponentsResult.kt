// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents the k-Cores as computed by [KCoreComponents].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KCoreComponentsResult">Online Documentation</a>
 */
external  class KCoreComponentsResult 
private constructor () : YObject {

/**
 * Gets a map which returns for each node the largest `k` for which a node is contained in the k-core.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KCoreComponentsResult%23kCores">Online Documentation</a>
 */
final val kCores: ResultItemMapping<INode, Double>
/**
 * Gets the largest `k` for which the k-core is not empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KCoreComponentsResult%23maximumK">Online Documentation</a>
 */
final val maximumK: Double
/**
 * Gets the k-Core with the given degree `k`.
 * @param [k] The degree of the k-core.
 * @return A collection of nodes which constitute the k-core with degree `k`. Might be empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KCoreComponentsResult%23KCoreComponentsResult-method-getKCore">Online Documentation</a>
 */
 final   fun getKCore( k: Int ):ResultItemCollection<INode>

companion object : ClassMetadata<KCoreComponentsResult> {
}
}
