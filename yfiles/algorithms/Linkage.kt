// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * A specifier for average-linkage (or mean-linkage) clustering.
 * @see [Groups.hierarchicalClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Linkage">Online Documentation</a>
 */
external sealed class Linkage: YEnum<Linkage> {
   companion object: EnumMetadata<Linkage> {
       /**
 * A specifier for single-linkage (or minimum-linkage) clustering.
 * 
 * Value - `0`
 * @see [Groups.hierarchicalClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Linkage%23SINGLE">Online Documentation</a>
 */
val SINGLE: Linkage

/**
 * A specifier for complete-linkage (or maximum-linkage) clustering.
 * 
 * Value - `1`
 * @see [Groups.hierarchicalClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Linkage%23COMPLETE">Online Documentation</a>
 */
val COMPLETE: Linkage

/**
 * A specifier for average-linkage (or mean-linkage) clustering.
 * 
 * Value - `2`
 * @see [Groups.hierarchicalClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Linkage%23AVERAGE">Online Documentation</a>
 */
val AVERAGE: Linkage
   }
}
