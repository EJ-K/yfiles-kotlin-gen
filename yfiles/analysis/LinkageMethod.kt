// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Provides constants to change how the distance between clusters is determined.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinkageMethod">Online Documentation</a>
 */
external sealed class LinkageMethod: YEnum<LinkageMethod> {
   companion object: EnumMetadata<LinkageMethod> {
       /**
 * Perform single-linkage (or minimum-linkage) clustering.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinkageMethod%23SINGLE">Online Documentation</a>
 */
val SINGLE: LinkageMethod

/**
 * Perform complete-linkage (or maximum-linkage) clustering.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinkageMethod%23COMPLETE">Online Documentation</a>
 */
val COMPLETE: LinkageMethod

/**
 * Perform mean-linkage (or average-linkage) clustering.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LinkageMethod%23AVERAGE">Online Documentation</a>
 */
val AVERAGE: LinkageMethod
   }
}
